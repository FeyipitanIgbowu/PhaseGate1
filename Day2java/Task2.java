public class Task2 {

	public static int score(int scoreOne, int scoreTwo, int scoreThree) {
		if (typeOf(scoreOne) != int || typeOf(scoreTwo) != int || typeOf(scoreThree) != int) {
		raise ValueError;
		}
	int average = (scoreOne + scoreTwo + scoreThree) / 3;
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
}
