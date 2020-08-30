package com.example.edtech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    private DatabaseReference refDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        refDatabase = FirebaseDatabase.getInstance().getReference();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // gets ride of top bar with application name
        getSupportActionBar().hide();
        // gets ride of top bar with time, date, charge, etc.
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final TextView questionView = (TextView) findViewById (R.id.questionText);
        final TextView timerView = (TextView) findViewById (R.id.timerText);
        final Button buttonAView = (Button) findViewById (R.id.buttonA);
        final Button buttonBView = (Button) findViewById (R.id.buttonB);
        final Button buttonCView = (Button) findViewById (R.id.buttonC);
        final Button buttonDView = (Button) findViewById (R.id.buttonD);


        final DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("quizzes");
        final DatabaseReference rDatabase = FirebaseDatabase.getInstance().getReference("results");

        mDatabase.child("questionnumber").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int data = dataSnapshot.getValue(int.class);
                if(data==1){
                    timerView.setText("1");
                    mDatabase.child("question1").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            questionView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceA1").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonAView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceB1").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonBView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceC1").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonCView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceD1").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonDView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    buttonAView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonA();
                        }
                    });
                    buttonBView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonB();
                        }
                    });
                    buttonCView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonC();
                        }
                    });
                    buttonDView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonD();
                        }
                    });
                }






                if(data==2){
                    timerView.setText("2");
                    mDatabase.child("question2").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            questionView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceA2").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonAView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceB2").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonBView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceC2").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonCView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceD2").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonDView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    buttonAView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonA2();
                        }
                    });
                    buttonBView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonB2();
                        }
                    });
                    buttonCView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonC2();
                        }
                    });
                    buttonDView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonD2();
                        }
                    });
                }






                if(data==3){
                    timerView.setText("3");
                        mDatabase.child("question3").addValueEventListener(new ValueEventListener() {
                            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                                String data = dataSnapshot.getValue(String.class);
                                questionView.setText(data);
                            }@Override
                            public void onCancelled(DatabaseError databaseError) {
                            }
                        });
                        mDatabase.child("choiceA3").addValueEventListener(new ValueEventListener() {
                            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                                String data = dataSnapshot.getValue(String.class);
                                buttonAView.setText(data);
                            }@Override
                            public void onCancelled(DatabaseError databaseError) {
                            }
                        });
                        mDatabase.child("choiceB3").addValueEventListener(new ValueEventListener() {
                            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                                String data = dataSnapshot.getValue(String.class);
                                buttonBView.setText(data);
                            }@Override
                            public void onCancelled(DatabaseError databaseError) {
                            }
                        });
                        mDatabase.child("choiceC3").addValueEventListener(new ValueEventListener() {
                            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                                String data = dataSnapshot.getValue(String.class);
                                buttonCView.setText(data);
                            }@Override
                            public void onCancelled(DatabaseError databaseError) {
                            }
                        });
                        mDatabase.child("choiceD3").addValueEventListener(new ValueEventListener() {
                            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                                String data = dataSnapshot.getValue(String.class);
                                buttonDView.setText(data);
                            }@Override
                            public void onCancelled(DatabaseError databaseError) {
                            }
                        });
                    buttonAView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonA3();
                        }
                    });
                    buttonBView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonB3();
                        }
                    });
                    buttonCView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonC3();
                        }
                    });
                    buttonDView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonD3();
                        }
                    });
                }





                if(data==4){
                    timerView.setText("4");
                    mDatabase.child("question4").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            questionView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceA4").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonAView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceB4").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonBView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceC4").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonCView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceD4").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonDView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    buttonAView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonA4();
                        }
                    });
                    buttonBView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonB4();
                        }
                    });
                    buttonCView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonC4();
                        }
                    });
                    buttonDView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonD4();
                        }
                    });
                }




                if(data==5){
                    timerView.setText("5");
                    mDatabase.child("question5").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            questionView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceA5").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonAView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceB5").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonBView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceC5").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonCView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceD5").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonDView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    buttonAView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonA5();
                        }
                    });
                    buttonBView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonB5();
                        }
                    });
                    buttonCView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonC5();
                        }
                    });
                    buttonDView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonD5();
                        }
                    });
                }





                if(data==6){
                    timerView.setText("6");
                    mDatabase.child("question6").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            questionView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceA6").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonAView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceB6").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonBView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceC6").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonCView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceD6").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonDView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    buttonAView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonA6();
                        }
                    });
                    buttonBView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonB6();
                        }
                    });
                    buttonCView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonC6();
                        }
                    });
                    buttonDView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonD6();
                        }
                    });
                }






                if(data==7){
                    timerView.setText("7");
                    mDatabase.child("question7").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            questionView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceA7").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonAView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceB7").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonBView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceC7").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonCView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceD7").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonDView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    buttonAView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonA7();
                        }
                    });
                    buttonBView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonB7();
                        }
                    });
                    buttonCView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonC7();
                        }
                    });
                    buttonDView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonD7();
                        }
                    });
                }





                if(data==8){
                    timerView.setText("8");
                    mDatabase.child("question8").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            questionView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceA8").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonAView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceB8").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonBView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceC8").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonCView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceD8").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonDView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    buttonAView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonA8();
                        }
                    });
                    buttonBView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonB8();
                        }
                    });
                    buttonCView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonC8();
                        }
                    });
                    buttonDView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonD8();
                        }
                    });
                }





                if(data==9){
                    timerView.setText("9");
                    mDatabase.child("question9").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            questionView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceA9").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonAView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceB9").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonBView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceC9").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonCView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceD9").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonDView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    buttonAView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonA9();
                        }
                    });
                    buttonBView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonB9();
                        }
                    });
                    buttonCView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonC9();
                        }
                    });
                    buttonDView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonD9();
                        }
                    });
                }


                if(data==10){
                    timerView.setText("10");
                    mDatabase.child("question10").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            questionView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceA10").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonAView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceB10").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonBView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceC10").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonCView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    mDatabase.child("choiceD10").addValueEventListener(new ValueEventListener() {
                        @Override public void onDataChange(DataSnapshot dataSnapshot) {
                            String data = dataSnapshot.getValue(String.class);
                            buttonDView.setText(data);
                        }@Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    buttonAView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonA10();
                        }
                    });
                    buttonBView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonB10();
                        }
                    });
                    buttonCView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonC10();
                        }
                    });
                    buttonDView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openButtonD10();
                        }
                    });
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });


    }
    final DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("quizzes");
    final DatabaseReference rDatabase = FirebaseDatabase.getInstance().getReference("results");

    public void openButtonA() {
        mDatabase.child("correctchoice1").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("A")){refDatabase.child("results").child("student11").setValue("Correct");
                }else{refDatabase.child("results").child("student11").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonB() {
        mDatabase.child("correctchoice1").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("B")){refDatabase.child("results").child("student11").setValue("Correct");
                }else{refDatabase.child("results").child("student11").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonC() {
        mDatabase.child("correctchoice1").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("C")){refDatabase.child("results").child("student11").setValue("Correct");
                }else{refDatabase.child("results").child("student11").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonD() {
        mDatabase.child("correctchoice1").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("D")){refDatabase.child("results").child("student11").setValue("Correct");
                }else{refDatabase.child("results").child("student11").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }




    public void openButtonA2() {
        mDatabase.child("correctchoice2").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("A")){refDatabase.child("results").child("student12").setValue("Correct");
                }else{refDatabase.child("results").child("student12").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonB2() {
        mDatabase.child("correctchoice2").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("B")){refDatabase.child("results").child("student12").setValue("Correct");
                }else{refDatabase.child("results").child("student12").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonC2() {
        mDatabase.child("correctchoice2").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("C")){refDatabase.child("results").child("student12").setValue("Correct");
                }else{refDatabase.child("results").child("student12").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonD2() {
        mDatabase.child("correctchoice2").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("D")){refDatabase.child("results").child("student12").setValue("Correct");
                }else{refDatabase.child("results").child("student12").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }



    public void openButtonA3() {
        mDatabase.child("correctchoice3").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("A")){refDatabase.child("results").child("student13").setValue("Correct");
                }else{refDatabase.child("results").child("student13").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonB3() {
        mDatabase.child("correctchoice3").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("B")){refDatabase.child("results").child("student13").setValue("Correct");
                }else{refDatabase.child("results").child("student13").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonC3() {
        mDatabase.child("correctchoice3").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("C")){refDatabase.child("results").child("student13").setValue("Correct");
                }else{refDatabase.child("results").child("student13").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonD3() {
        mDatabase.child("correctchoice3").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("D")){refDatabase.child("results").child("student13").setValue("Correct");
                }else{refDatabase.child("results").child("student13").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }



    public void openButtonA4() {
        mDatabase.child("correctchoice4").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("A")){refDatabase.child("results").child("student14").setValue("Correct");
                }else{refDatabase.child("results").child("student14").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonB4() {
        mDatabase.child("correctchoice4").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("B")){refDatabase.child("results").child("student14").setValue("Correct");
                }else{refDatabase.child("results").child("student14").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonC4() {
        mDatabase.child("correctchoice4").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("C")){refDatabase.child("results").child("student14").setValue("Correct");
                }else{refDatabase.child("results").child("student14").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonD4() {
        mDatabase.child("correctchoice4").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("D")){refDatabase.child("results").child("student14").setValue("Correct");
                }else{refDatabase.child("results").child("student14").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }





    public void openButtonA5() {
        mDatabase.child("correctchoice5").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("A")){refDatabase.child("results").child("student15").setValue("Correct");
                }else{refDatabase.child("results").child("student15").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonB5() {
        mDatabase.child("correctchoice5").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("B")){refDatabase.child("results").child("student15").setValue("Correct");
                }else{refDatabase.child("results").child("student15").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonC5() {
        mDatabase.child("correctchoice5").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("C")){refDatabase.child("results").child("student15").setValue("Correct");
                }else{refDatabase.child("results").child("student15").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonD5() {
        mDatabase.child("correctchoice5").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("D")){refDatabase.child("results").child("student15").setValue("Correct");
                }else{refDatabase.child("results").child("student15").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }






    public void openButtonA6() {
        mDatabase.child("correctchoice6").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("A")){refDatabase.child("results").child("student16").setValue("Correct");
                }else{refDatabase.child("results").child("student16").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonB6() {
        mDatabase.child("correctchoice6").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("B")){refDatabase.child("results").child("student16").setValue("Correct");
                }else{refDatabase.child("results").child("student16").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonC6() {
        mDatabase.child("correctchoice6").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("C")){refDatabase.child("results").child("student16").setValue("Correct");
                }else{refDatabase.child("results").child("student16").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonD6() {
        mDatabase.child("correctchoice6").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("D")){refDatabase.child("results").child("student16").setValue("Correct");
                }else{refDatabase.child("results").child("student16").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }





    public void openButtonA7() {
        mDatabase.child("correctchoice7").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("A")){refDatabase.child("results").child("student17").setValue("Correct");
                }else{refDatabase.child("results").child("student17").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonB7() {
        mDatabase.child("correctchoice7").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("B")){refDatabase.child("results").child("student17").setValue("Correct");
                }else{refDatabase.child("results").child("student17").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonC7() {
        mDatabase.child("correctchoice7").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("C")){refDatabase.child("results").child("student17").setValue("Correct");
                }else{refDatabase.child("results").child("student17").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonD7() {
        mDatabase.child("correctchoice7").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("D")){refDatabase.child("results").child("student17").setValue("Correct");
                }else{refDatabase.child("results").child("student17").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }






    public void openButtonA8() {
        mDatabase.child("correctchoice8").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("A")){refDatabase.child("results").child("student18").setValue("Correct");
                }else{refDatabase.child("results").child("student18").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonB8() {
        mDatabase.child("correctchoice8").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("B")){refDatabase.child("results").child("student18").setValue("Correct");
                }else{refDatabase.child("results").child("student18").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonC8() {
        mDatabase.child("correctchoice8").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("C")){refDatabase.child("results").child("student18").setValue("Correct");
                }else{refDatabase.child("results").child("student18").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonD8() {
        mDatabase.child("correctchoice8").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("D")){refDatabase.child("results").child("student18").setValue("Correct");
                }else{refDatabase.child("results").child("student18").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }





    public void openButtonA9() {
        mDatabase.child("correctchoice9").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("A")){refDatabase.child("results").child("student19").setValue("Correct");
                }else{refDatabase.child("results").child("student19").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonB9() {
        mDatabase.child("correctchoice9").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("B")){refDatabase.child("results").child("student19").setValue("Correct");
                }else{refDatabase.child("results").child("student19").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonC9() {
        mDatabase.child("correctchoice9").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("C")){refDatabase.child("results").child("student19").setValue("Correct");
                }else{refDatabase.child("results").child("student19").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonD9() {
        mDatabase.child("correctchoice9").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("D")){refDatabase.child("results").child("student19").setValue("Correct");
                }else{refDatabase.child("results").child("student19").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }





    public void openButtonA10() {
        mDatabase.child("correctchoice10").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("A")){refDatabase.child("results").child("student110").setValue("Correct");
                }else{refDatabase.child("results").child("student110").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonB10() {
        mDatabase.child("correctchoice10").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("B")){refDatabase.child("results").child("student110").setValue("Correct");
                }else{refDatabase.child("results").child("student110").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonC10() {
        mDatabase.child("correctchoice10").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("C")){refDatabase.child("results").child("student110").setValue("Correct");
                }else{refDatabase.child("results").child("student110").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
    public void openButtonD10() {
        mDatabase.child("correctchoice10").addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                String data = dataSnapshot.getValue(String.class);
                if(data.equals("D")){refDatabase.child("results").child("student110").setValue("Correct");
                }else{refDatabase.child("results").child("student110").setValue("Incorrect"); }
            }@Override public void onCancelled(DatabaseError databaseError) { }
        });
    }
}
