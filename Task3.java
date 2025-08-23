import java.util.Scanner;
public class Task3 {
	public static void main(String... feyi) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
	
	if (number % 3 == 0) {
		System.out.println("It is divisible by 3");
	} else {
		System.out.println("It is not divisible by 3");
		}

}
}