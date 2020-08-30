let results = document.getElementById("resultsheader");
let resultsdiv = document.getElementById("resultsdiv");
let square = document.getElementById("square");

var ref = firebase.database().ref("results");
ref.once("value").then(function(snapshot) {
    var key1 = snapshot.child("student11").val(); // "Ada"
    var key2 = snapshot.child("student12").val(); // "Ada"
    var key3 = snapshot.child("student13").val(); // "Ada"
    var key4 = snapshot.child("student14").val(); // "Ada"
    var key5 = snapshot.child("student15").val(); // "Ada"

    var keys = [key1, key2, key3, key4, key5];
	
	correctcount = keys.filter(x => x == "Correct").length;
	incorrectcount = keys.filter(x => x == "Incorrect").length;
	points = 100*(correctcount-incorrectcount);
	console.log("Correct: " + correctcount + "/5");
	console.log("Points: " + points);
	resultscount = correctcount + "/5";
	results.innerHTML = resultscount;

   
  });

