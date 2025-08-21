import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertRaises;
import org.junit.jupiter.api.test;

@Test
public class Task2Test {

	public void testFunctionWorks() {
	
	int scoreOne = 100;
	int scoreTwo = 60;
	int scoreThree = 30;
	
	Task2 input = new Task2();
	int result = input.score(scoreOne,scoreTwo,scoreThree);
	
	assertEquals(result, 'A', 'B', 'C');
	}
		
	}
