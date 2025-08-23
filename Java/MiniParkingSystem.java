import java.util.Arrays;
public class MiniParkingSystem {

int [] spaces = {1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0};

public String parkingSpaces(int space_num) {
	if (spaces[space_num] == 1) {
		return "This spot is not available";
	}
	else if (spaces[space_num] == 0) {
		spaces[space] = 1;
		return "Space secured";
	}
	}
public String SpaceAvailability(int slot_num){
	spaces[space] = slot_num;
	if (spaces[space] == 0){
		return "Theres is no car parked here";
	}
	else if (spaces[space] == 1) {
		spaces[space] = 0;
		return "Your car is available, Thank you for using our services";
	}
}
public static void main(String... feyi) {
MiniParkingSystem input = new MiniParkingSystem();
		
	for(int space = 0; space < spaces.length; space++) {
		System.out.println(parkingSpaces(space_num));
		}
	for(int space = 0; space < spaces.length; space++) {
		System.out.println(SpaceLeaving(slot_num));
		}
}
}