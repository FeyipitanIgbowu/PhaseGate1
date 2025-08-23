function arrayFunction(name){
	let names = []
	
	for(let count = name; count < names.length; count++) {
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
			return name[0], name[1],"and", names.length - 2 ,"likes this"
			}
			}
	return names;
	}
let result = ["Feyi"]
console.log(arrayFunction(result))

let result2 = ["Max", "John", "Mark"]
console.log(arrayFunction(result2))

let result3 = ["Alex", "Jacob", "Mark", "Max"]
console.log(arrayFunction(result3))

