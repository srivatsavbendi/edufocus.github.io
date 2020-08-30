let button = document.getElementById("button");
let display = document.getElementById("display");


button.addEventListener("click", function(){

	let question1 = document.getElementById("question1").value;
	let correctchoice1 = document.getElementById("correctchoice1").value;
	let choiceA1 = document.getElementById("choiceA1").value;
	let choiceB1 = document.getElementById("choiceB1").value;
	let choiceC1 = document.getElementById("choiceC1").value;
	let choiceD1 = document.getElementById("choiceD1").value;

	let question2 = document.getElementById("question2").value;
	let correctchoice2 = document.getElementById("correctchoice2").value;
	let choiceA2 = document.getElementById("choiceA2").value;
	let choiceB2 = document.getElementById("choiceB2").value;
	let choiceC2 = document.getElementById("choiceC2").value;
	let choiceD2 = document.getElementById("choiceD2").value;

	let question3 = document.getElementById("question3").value;
	let correctchoice3 = document.getElementById("correctchoice3").value;
	let choiceA3 = document.getElementById("choiceA3").value;
	let choiceB3 = document.getElementById("choiceB3").value;
	let choiceC3 = document.getElementById("choiceC3").value;
	let choiceD3 = document.getElementById("choiceD3").value;

	let question4 = document.getElementById("question4").value;
	let correctchoice4 = document.getElementById("correctchoice4").value;
	let choiceA4 = document.getElementById("choiceA4").value;
	let choiceB4 = document.getElementById("choiceB4").value;
	let choiceC4 = document.getElementById("choiceC4").value;
	let choiceD4 = document.getElementById("choiceD4").value;

	let question5 = document.getElementById("question5").value;
	let correctchoice5 = document.getElementById("correctchoice5").value;
	let choiceA5 = document.getElementById("choiceA5").value;
	let choiceB5 = document.getElementById("choiceB5").value;
	let choiceC5 = document.getElementById("choiceC5").value;
	let choiceD5 = document.getElementById("choiceD5").value;

	let question6 = document.getElementById("question6").value;
	let correctchoice6 = document.getElementById("correctchoice6").value;
	let choiceA6 = document.getElementById("choiceA6").value;
	let choiceB6 = document.getElementById("choiceB6").value;
	let choiceC6 = document.getElementById("choiceC6").value;
	let choiceD6 = document.getElementById("choiceD6").value;

	let question7 = document.getElementById("question7").value;
	let correctchoice7 = document.getElementById("correctchoice7").value;
	let choiceA7 = document.getElementById("choiceA7").value;
	let choiceB7 = document.getElementById("choiceB7").value;
	let choiceC7 = document.getElementById("choiceC7").value;
	let choiceD7 = document.getElementById("choiceD7").value;

	let question8 = document.getElementById("question8").value;
	let correctchoice8 = document.getElementById("correctchoice8").value;
	let choiceA8 = document.getElementById("choiceA8").value;
	let choiceB8 = document.getElementById("choiceB8").value;
	let choiceC8 = document.getElementById("choiceC8").value;
	let choiceD8 = document.getElementById("choiceD8").value;

	let question9 = document.getElementById("question9").value;
	let correctchoice9 = document.getElementById("correctchoice9").value;
	let choiceA9 = document.getElementById("choiceA9").value;
	let choiceB9 = document.getElementById("choiceB9").value;
	let choiceC9 = document.getElementById("choiceC9").value;
	let choiceD9 = document.getElementById("choiceD9").value;

	let question10 = document.getElementById("question10").value;
	let correctchoice10 = document.getElementById("correctchoice10").value;
	let choiceA10 = document.getElementById("choiceA10").value;
	let choiceB10 = document.getElementById("choiceB10").value;
	let choiceC10 = document.getElementById("choiceC10").value;
	let choiceD10 = document.getElementById("choiceD10").value;


	var data = {
		question1: question1,
		correctchoice1: correctchoice1,
		choiceA1: choiceA1,
		choiceB1: choiceB1,
		choiceC1: choiceC1,
		choiceD1: choiceD1,
		question2: question2,
		correctchoice2: correctchoice2,
		choiceA2: choiceA2,
		choiceB2: choiceB2,
		choiceC2: choiceC2,
		choiceD2: choiceD2,
		question3: question3,
		correctchoice3: correctchoice3,
		choiceA3: choiceA3,
		choiceB3: choiceB3,
		choiceC3: choiceC3,
		choiceD3: choiceD3,
		question4: question4,
		correctchoice4: correctchoice4,
		choiceA4: choiceA4,
		choiceB4: choiceB4,
		choiceC4: choiceC4,
		choiceD4: choiceD4,
		question5: question5,
		correctchoice5: correctchoice5,
		choiceA5: choiceA5,
		choiceB5: choiceB5,
		choiceC5: choiceC5,
		choiceD5: choiceD5,
		question6: question6,
		correctchoice6: correctchoice6,
		choiceA6: choiceA6,
		choiceB6: choiceB6,
		choiceC6: choiceC6,
		choiceD6: choiceD6,
		question7: question7,
		correctchoice7: correctchoice7,
		choiceA7: choiceA7,
		choiceB7: choiceB7,
		choiceC7: choiceC7,
		choiceD7: choiceD7,
		question8: question8,
		correctchoice8: correctchoice8,
		choiceA8: choiceA8,
		choiceB8: choiceB8,
		choiceC8: choiceC8,
		choiceD8: choiceD8,
		question9: question9,
		correctchoice9: correctchoice9,
		choiceA9: choiceA9,
		choiceB9: choiceB9,
		choiceC9: choiceC9,
		choiceD9: choiceD9,
		question10: question10,
		correctchoice10: correctchoice10,
		choiceA10: choiceA10,
		choiceB10: choiceB10,
		choiceC10: choiceC10,
		choiceD10: choiceD10,
		questionnumber: 1
	}

	var database = firebase.database();
	var ref = database.ref("quizzes");

	ref.set(data);


})



display.addEventListener("click", function(){
	let questionnumber = document.getElementById("questionnumber").value;
	
	questionnumber1 = parseInt(questionnumber);

	let question1 = document.getElementById("question1").value;
	let correctchoice1 = document.getElementById("correctchoice1").value;
	let choiceA1 = document.getElementById("choiceA1").value;
	let choiceB1 = document.getElementById("choiceB1").value;
	let choiceC1 = document.getElementById("choiceC1").value;
	let choiceD1 = document.getElementById("choiceD1").value;

	let question2 = document.getElementById("question2").value;
	let correctchoice2 = document.getElementById("correctchoice2").value;
	let choiceA2 = document.getElementById("choiceA2").value;
	let choiceB2 = document.getElementById("choiceB2").value;
	let choiceC2 = document.getElementById("choiceC2").value;
	let choiceD2 = document.getElementById("choiceD2").value;

	let question3 = document.getElementById("question3").value;
	let correctchoice3 = document.getElementById("correctchoice3").value;
	let choiceA3 = document.getElementById("choiceA3").value;
	let choiceB3 = document.getElementById("choiceB3").value;
	let choiceC3 = document.getElementById("choiceC3").value;
	let choiceD3 = document.getElementById("choiceD3").value;

	let question4 = document.getElementById("question4").value;
	let correctchoice4 = document.getElementById("correctchoice4").value;
	let choiceA4 = document.getElementById("choiceA4").value;
	let choiceB4 = document.getElementById("choiceB4").value;
	let choiceC4 = document.getElementById("choiceC4").value;
	let choiceD4 = document.getElementById("choiceD4").value;

	let question5 = document.getElementById("question5").value;
	let correctchoice5 = document.getElementById("correctchoice5").value;
	let choiceA5 = document.getElementById("choiceA5").value;
	let choiceB5 = document.getElementById("choiceB5").value;
	let choiceC5 = document.getElementById("choiceC5").value;
	let choiceD5 = document.getElementById("choiceD5").value;

	let question6 = document.getElementById("question6").value;
	let correctchoice6 = document.getElementById("correctchoice6").value;
	let choiceA6 = document.getElementById("choiceA6").value;
	let choiceB6 = document.getElementById("choiceB6").value;
	let choiceC6 = document.getElementById("choiceC6").value;
	let choiceD6 = document.getElementById("choiceD6").value;

	let question7 = document.getElementById("question7").value;
	let correctchoice7 = document.getElementById("correctchoice7").value;
	let choiceA7 = document.getElementById("choiceA7").value;
	let choiceB7 = document.getElementById("choiceB7").value;
	let choiceC7 = document.getElementById("choiceC7").value;
	let choiceD7 = document.getElementById("choiceD7").value;

	let question8 = document.getElementById("question8").value;
	let correctchoice8 = document.getElementById("correctchoice8").value;
	let choiceA8 = document.getElementById("choiceA8").value;
	let choiceB8 = document.getElementById("choiceB8").value;
	let choiceC8 = document.getElementById("choiceC8").value;
	let choiceD8 = document.getElementById("choiceD8").value;

	let question9 = document.getElementById("question9").value;
	let correctchoice9 = document.getElementById("correctchoice9").value;
	let choiceA9 = document.getElementById("choiceA9").value;
	let choiceB9 = document.getElementById("choiceB9").value;
	let choiceC9 = document.getElementById("choiceC9").value;
	let choiceD9 = document.getElementById("choiceD9").value;

	let question10 = document.getElementById("question10").value;
	let correctchoice10 = document.getElementById("correctchoice10").value;
	let choiceA10 = document.getElementById("choiceA10").value;
	let choiceB10 = document.getElementById("choiceB10").value;
	let choiceC10 = document.getElementById("choiceC10").value;
	let choiceD10 = document.getElementById("choiceD10").value;


	var data = {
		question1: question1,
		correctchoice1: correctchoice1,
		choiceA1: choiceA1,
		choiceB1: choiceB1,
		choiceC1: choiceC1,
		choiceD1: choiceD1,
		question2: question2,
		correctchoice2: correctchoice2,
		choiceA2: choiceA2,
		choiceB2: choiceB2,
		choiceC2: choiceC2,
		choiceD2: choiceD2,
		question3: question3,
		correctchoice3: correctchoice3,
		choiceA3: choiceA3,
		choiceB3: choiceB3,
		choiceC3: choiceC3,
		choiceD3: choiceD3,
		question4: question4,
		correctchoice4: correctchoice4,
		choiceA4: choiceA4,
		choiceB4: choiceB4,
		choiceC4: choiceC4,
		choiceD4: choiceD4,
		question5: question5,
		correctchoice5: correctchoice5,
		choiceA5: choiceA5,
		choiceB5: choiceB5,
		choiceC5: choiceC5,
		choiceD5: choiceD5,
		question6: question6,
		correctchoice6: correctchoice6,
		choiceA6: choiceA6,
		choiceB6: choiceB6,
		choiceC6: choiceC6,
		choiceD6: choiceD6,
		question7: question7,
		correctchoice7: correctchoice7,
		choiceA7: choiceA7,
		choiceB7: choiceB7,
		choiceC7: choiceC7,
		choiceD7: choiceD7,
		question8: question8,
		correctchoice8: correctchoice8,
		choiceA8: choiceA8,
		choiceB8: choiceB8,
		choiceC8: choiceC8,
		choiceD8: choiceD8,
		question9: question9,
		correctchoice9: correctchoice9,
		choiceA9: choiceA9,
		choiceB9: choiceB9,
		choiceC9: choiceC9,
		choiceD9: choiceD9,
		question10: question10,
		correctchoice10: correctchoice10,
		choiceA10: choiceA10,
		choiceB10: choiceB10,
		choiceC10: choiceC10,
		choiceD10: choiceD10,
		questionnumber: questionnumber1
	}

	var database = firebase.database();
	var ref = database.ref("quizzes");

	ref.set(data)
})

