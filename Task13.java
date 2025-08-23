public class Task13 {
	public static void main(String... feyi) {

int [] array = {1, 2, 3, 4, 5};
int minimum = array[0];
int maximum = minimum;
int second_largest = maximum;
	for(int count = 1; count < array.length; count++) {
		if( array.length < minimum) {
			minimum = array.length;
		}
		if (array.length > maximum) {
			maximum = array.length;
		}
		if (array.length > minimum && array.length < maximum) {
			second_largest = array.length;
			}
		}
	System.out.println(second_largest);
}
}