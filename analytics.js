let results1 = document.getElementById("resultsheader1");
let results2 = document.getElementById("resultsheader2");
let results3 = document.getElementById("resultsheader3");
let results4 = document.getElementById("resultsheader4");
let results5 = document.getElementById("resultsheader5");
let results6 = document.getElementById("resultsheader6");
let results7 = document.getElementById("resultsheader7");
let results8 = document.getElementById("resultsheader8");
let results9 = document.getElementById("resultsheader9");


var ref = firebase.database().ref("analytics");
ref.once("value").then(function(snapshot) {
    var key1 = snapshot.child("student1").val(); 
    var key2 = snapshot.child("student2").val(); 
    var key3 = snapshot.child("student3").val(); 
    var key4 = snapshot.child("student4").val(); 
    var key5 = snapshot.child("student5").val(); 
	var key6 = snapshot.child("student5").val(); 
	var key7 = snapshot.child("student7").val(); 
	var key8 = snapshot.child("student8").val(); 
	var key9 = snapshot.child("student9").val(); 
	
	result1 = (100-(5*key1)) + "%"
	result2 = (100-(5*key2)) + "%"
	result3 = (100-(5*key3)) + "%"
	result4 = (100-(5*key4)) + "%"
	result5 = (100-(5*key5)) + "%"
	result6 = (100-(5*key6)) + "%"
	result7 = (100-(5*key7)) + "%"
	result8 = (100-(5*key8)) + "%"
	result9 = (100-(5*key9)) + "%"

	results1.innerHTML = result1;
	results2.innerHTML = result2;
	results3.innerHTML = result3;
	results4.innerHTML = result4;
	results5.innerHTML = result5;
	results6.innerHTML = result6;
	results7.innerHTML = result7;
	results8.innerHTML = result8;
	results9.innerHTML = result9;


   
  });

