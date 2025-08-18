public class Task7 {
	public static void main(String... feyi) {

int [] array = {1, 2, 3, 4, 5};
int smallest = array[0];
	for(int count = 0; count < array.length; count++) {
		if (array.length < smallest) {
			smallest = array.length;
			}
		}
	System.out.print(smallest);
}
}
	
