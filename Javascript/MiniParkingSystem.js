function FreeSpaces(space_num){
	for(let space = 0; space < spaces.length; space++) {
		if (spaces[space_num] == 1) {
			return "This spot is not available, Feyi parked her Benz here."
			}
		else if (spaces[space_num] == 0) {
			return "Space secured"
			spaces[space] = 1;
		}
	}
return spaces;
}
function SpaceAvailability(slot_num){
	for(let space = 0; space < spaces.length; space++) {
	spaces[space] = slot_num;
	if (spaces[space] == 0){
		return "Theres is no car parked here"
	}
	else if (spaces[space] == 1) {
		return "Feyi your Ferrari is available, Thank you for using our services."
		spaces[space] = 0;
	}
}
return spaces;
	}
let spaces = [1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0];
console.log(FreeSpaces(1))
console.log(FreeSpaces(0))
console.log(SpaceAvailability(0))
console.log(SpaceAvailability(1))
