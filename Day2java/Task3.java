public class Task3 {
	public int [] arrayFunction(String name){
	String [] names = new int[1];
		
	for(String count = name; count < names.length; count++) {
		if (names.length == 0) {
			return "No one likes this";
		}
		else if (names.length == 1) {
			return name[0] ,"likes this";
			}
		else if (names.length == 2) {
			return name[0], name[1],"likes this";
			}
		else if (names.length == 3) {
			return name[0], name[1], name[2], "likes this";
						}
		else if (names.length > 3) {	
			return name[0], name[1], "and", names.length - 2, "likes this";
			}
	return names;
		}
	}
}
