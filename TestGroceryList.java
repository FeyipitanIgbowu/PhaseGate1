import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertRaises;
import org.junit.jupiter.api.test;

@Test
public class TestGroceryList {

	public void testOption1Works() {
	
	String userInput = "Feyi";
	
	int result = optionOne(option1);
	
	assertEquals(result, "Items add sucessfully");
	}
	
@Test
	public void testOption2Works() {
	
	String userInput = "Chioma";
	
	int result = optionOne(option2);
	
	assertEquals(result, "Item not on list");
	}

@Test
	public void testOption3Works() {
	
	String userInput = "3";
	
	int result = optionOne(option2);
	
	assertEquals(result, [Feyi]);
	}
	}
