public class Task6 {
	public static void main(String... feyi) {

int [] array = {1, 2, 3, 4, 5};
int largest = array[0];
	for(int count = 0; count < array.length; count++) {
		if (array.length > largest) {
			largest = array.length;
			}
		}
	System.out.print(largest);
}
}
	
