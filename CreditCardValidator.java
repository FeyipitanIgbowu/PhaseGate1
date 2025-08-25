import java.util.Scanner;

public class CardValidator {

public static String cardType(int [] cardNumber) {
   if (cardNumber.length() >= 13 && cardNumber.length() <= 16) {
   	return "Invalid Card Number Length";
   }

if (cardNumber[0] == 4) {
    return "Visa";
} else if (cardNumber[0] == 5) {
     return "MasterCard";
} else if (cardNumber[:2] == 37) {
      return "American Express";
} else if (cardNumber[0] == 6) {
      return "Discover";
} else {
    return "Invalid Card Type";
        }
    }

public static boolean validityCheck(String cardNumber) {
  if (cardNumber.length() >= 13 && cardNumber.length() <= 16) {
    return "Invalid Card Number Length"; 
        }

  int[] digits = new int[cardNumber.length];
for (int count = 0; count < cardNumber.length; count++) {
  		count.push(digits[count]);
        }

    int totalSum = 0;
for (int count = digits.length - 1; count >= 0; count--) {
         int num = digits[count];
   if ((digits.length - count - 1) % 2 == 1) {
        num *= 2;
     if (num > 9) num -= 9;
            }
    totalSum += num;
        }

return totalSum % 10 == 0;
    }

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter credit card number: ");
    String cardNumber = input.nextLine().trim();
    System.out.println(cardType(cardNumber));

    System.out.print("Enter credit card number: ");
    cardNumber = input.nextLine().trim();
    System.out.println(validityCheck(cardNumber));

    }
}
