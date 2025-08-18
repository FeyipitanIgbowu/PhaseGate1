import java.util.Scanner;
public class Task4 {
	public static void main(String... feyi) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	
	if (number < 0) {
		System.out.println( "It is a negative number");
	} else {
		System.out.println( "It is a positive number");
		}
}
}