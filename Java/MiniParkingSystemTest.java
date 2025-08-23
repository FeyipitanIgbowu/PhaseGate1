import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MiniParkingSystemTest {
@Test
	public void testForFreeSpace() {
	
	int userInput = 3;
	
	MiniParkingSystem input = new MiniParkingSystem();
	String result = input.parkingSpaces(userInput);
	
	assertEquals(result, "Space secured");
	}
	
@Test
	public void testForTakenSpace() {
	
	int userInput = 0;
	
	MiniParkingSystem input = new MiniParkingSystem();
	String result = input.parkingSpaces(userInput);
	
	assertEquals(result, "This spot is not available");
	}
	
@Test
	public void testForAvailabilityOfSpace() {
	
	int userInput = 1;
	
	MiniParkingSystem input = new MiniParkingSystem();
	String result = input.SpaceAvailability(userInput);
	
	assertEquals(result, "Your car is available, Thank you for using our services");
	}

@Test
	public void testForInAvailabilityOfSpace() {
	
	int userInput = 0;
	
	MiniParkingSystem input = new MiniParkingSystem();
	String result = input.SpaceAvailability(userInput);
	
	assertEquals(result, "Theres is no car parked here");
	}


}
