function score(scoreOne, scoreTwo, scoreThree) {
	let average = (scoreOne + scoreTwo + scoreThree) / 3;
	if (90 <= average <= 100) {
		return 'A';
		}
	else if (80 <= average < 90) {
		return 'B';
		}
	else if (70 <= average < 80) {
		return 'C';
		}
	else if (60 <= average < 70) {
		return 'D';
		}
	else if (0 <= average < 60) {
		return 'F';
		}
	return average;
	
}

console.log(score(100, 70, 30));