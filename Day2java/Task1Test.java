import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertRaises;
import org.junit.jupiter.api.test;

@Test
public class Task1Test {

	public void testFunctionWorks() {
	
	int fathersAge = 50;
	int sonsAge = 10;
	
	Task1 input = new Task1();
	int result = input.age(fathersAge, sonsAge);
	
	assertEquals(result, 30);
	}
	
	public void testNegativeInput() {
	
	int fathersAge = -50;
	int sonsAge = 10;

	Task1 input = new Task1();
	int result = input.age(fathersAge, sonsAge);
	
	assertRaises(result, ValueError);
	}
	
	public void testZeroInput() {
	
	int fathersAge = 0;
	int sonsAge = 0;

	Task1 input = new Task1();
	int result = input.age(fathersAge, sonsAge);
	
	assertRaises(result, ValueError);
	}
	
	}