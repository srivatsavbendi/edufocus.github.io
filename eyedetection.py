from scipy.spatial import distance
from imutils import face_utils
import numpy as np
import time
import dlib
import cv2
from firebase import firebase

firebase = firebase.FirebaseApplication("https://edtech-95817.firebaseio.com/")
threshold = 0.3
frames = 10 #about 30 seconds
counter = 0
attentivecounter = 0
firebase.put("/analytics/", "student1", attentivecounter)

face_cascade = cv2.CascadeClassifier('haarcascade_frontalface_default.xml')

def eye_aspect_ratio(eye):
    A = distance.euclidean(eye[1], eye[5])
    B = distance.euclidean(eye[2], eye[4])
    C = distance.euclidean(eye[0], eye[3])

    ear = (A + B) / (2 * C)
    return ear

detector = dlib.get_frontal_face_detector()
predictor = dlib.shape_predictor('68_face_landmarks_predictor.dat')

(lStart, lEnd) = face_utils.FACIAL_LANDMARKS_IDXS['left_eye']
(rStart, rEnd) = face_utils.FACIAL_LANDMARKS_IDXS['right_eye']

video_capture = cv2.VideoCapture(0)

time.sleep(1)

while (True):
    ret, frame = video_capture.read()
    frame = cv2.flip(frame, 1)
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    faces = detector(gray, 0)
    face_rectangle = face_cascade.detectMultiScale(gray, 1.3, 5)

    # Draw rectangle around each face detected
    # for (x,y,w,h) in face_rectangle:
    # cv2.rectangle(frame,(x,y),(x+w,y+h),(62, 137, 137),2)

    for face in faces:

        shape = predictor(gray, face)
        shape = face_utils.shape_to_np(shape)

        # Left and Right Eye coordinates
        leftEye = shape[lStart:lEnd]
        rightEye = shape[rStart:rEnd]

        # Eye Aspect Ratio
        leftEyeAspectRatio = eye_aspect_ratio(leftEye)
        rightEyeAspectRatio = eye_aspect_ratio(rightEye)
        eyeAspectRatio = (leftEyeAspectRatio + rightEyeAspectRatio) / 2

        leftEyeHull = cv2.convexHull(leftEye)
        rightEyeHull = cv2.convexHull(rightEye)
        #cv2.drawContours(frame, [leftEyeHull], -1, (137, 137, 62), 1)
        #cv2.drawContours(frame, [rightEyeHull], -1, (137, 137, 62), 1)

        # Eye aspect ratio < threshold
        if (eyeAspectRatio < threshold):
            counter += 1
            if counter >= frames:
                cv2.putText(frame, "WAKE UP", (200, 100), cv2.FONT_HERSHEY_PLAIN, 3, (137, 137, 62), 3)
                attentivecounter +=1
                firebase.put("/analytics/", "student1", attentivecounter)
        else:
            counter = 0

    cv2.imshow('Video', frame)
    if (cv2.waitKey(1) & 0xFF == ord('q')):
        break

video_capture.release()
cv2.destroyAllWindows()
