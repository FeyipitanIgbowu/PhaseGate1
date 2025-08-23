public class Task1 {
	
	public static int age(int fathersAge, int sonsAge){
		if (typeOf(fathersAge) != int) {
			raise ValueError("Invalid Input");
			}
		if (fathersAge < 0 || sonsAge < 0) {
			raise ValueError("Invalid Input");
			}
		return fathersAge - sonsAge * 2;
		}
	}