import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.test;

@Test
public class Task$Test {

	public void testFunctionWorks() {
	
	int gallon = 4
		
	Task4 input = new Task4();
	int result = input.Distance(gallon);
	
	assertEquals(result, True)
	}
	
	
	public void testForNonIntInput() {
	
	String gallon = "Feyi";
	
	Task4 input = new Task4();
	int result = input.Distance(name);
	
	assertNotEquals(result, "Feyi likes this")
	}
	
	}
