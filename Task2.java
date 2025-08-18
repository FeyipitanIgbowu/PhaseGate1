import java.util.Scanner;
public class Task2 {

	public static void main(String... feyi) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter first number: ");
	int firstInteger = input.nextInt();
	
	System.out.println("Enter second number: ");
	int secondInteger = input.nextInt();
	
	System.out.println("Enter third number: ");
	int thirdInteger = input.nextInt();
	
	int sum = firstInteger + secondInteger + thirdInteger;
	System.out.println(sum);

	int average = (firstInteger + secondInteger + thirdInteger) / 3;
	System.out.println(average);
	
	int product = firstInteger * secondInteger * thirdInteger;
	System.out.println(product);

	int smallest = firstInteger;
		if (secondInteger < smallest) {
			smallest = secondInteger;
		} else if (thirdInteger < smallest) {
			smallest = thirdInteger;
				}
	System.out.println(smallest);	
		
	int largest = firstInteger;
		if (secondInteger > largest) {
			smallest = secondInteger;
		} else if (thirdInteger > largest) {
			smallest = thirdInteger;
				}
	System.out.println(largest);
}
}






















