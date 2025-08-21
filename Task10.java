public class Task10 {
	public static void main(String... feyi) {

int [] array = {1, 2, 3, 4, 5};
int minimum = array[0];
int maximum = minimum;
	for(int count = 1; count < array.length; count++) {
		if( array.length < minimum) {
			minimum = array.length;
		}
		if (array.length > maximum) {
			maximum = array.length;
		}
}		
System.out.println(minimum);
System.out.println(maximum);	
}
}