import java.util.ArrayList;
import java.util.Scanner;
public class GroceryList {
	
static ArrayList<String> groceries = new ArrayList<String>();
	
public static String menu(String menu) {
	return menu;
	}
public static String optionOne(String option1) {
	groceries.add(option1);
	return "Items add successfully";	
	}
public static String optionTwo(String option2) {
	if (groceries.contains(option2)) {
		groceries.remove(option2);
		return "Items removed successfully";
	}
	else {
		return "Item not on list";
			}
			}
public static String optionThree(String option3) {
	if (option3.equals(3)){
		return groceries.toString();
			}
	return option3;
	}

public static void main(String... feyi) {
	Scanner input = new Scanner(System.in);

		String menu = """
	
		Welcome To Feyi's Grocery Store
	1 -> Add Item
	2 -> Remove Item
	3 -> Show Available item
	0 -> Exit
		""";
		
	System.out.print(menu);
	System.out.print("Select an option: ");
	String option = input.nextLine();
			
	if (option.equals("1")) {
	System.out.print("What item do you want to Add?: ");
	String option1 = input.nextLine();
	optionOne(option1);
	}
	
	else if (option.equals("2")) {
	System.out.print("What item do you want to Remove?: ");
	String option2 = input.next();
	optionTwo(option2);
	}
	
	else if (option.equals("3")) {
	String option3 = input.next();
	optionThree(option3);
	}

}
}