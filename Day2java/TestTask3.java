import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.test;

@Test
public class Task3Test {

	public void testFunctionWorks() {
	
	String name = "Feyi"
	
	Task3 input = new Task3();
	int result = input.arrayFunction(name);
	
	assertEquals(result, "Feyi likes this")
	}
	
	
	public void testForNonStringInput() {
	
	int name = 9;
	
	Task3 input = new Task3();
	int result = input.arrayFunction(name);
	
	assertNotEquals(result, "Feyi likes this")
	}
	
	}
