spaces = [1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0]
def parking_spaces(spaces):
	if type(spaces) != list:
		raise ValueError("Invalid Data Type")

def space_availability(space_num):
	spaces = [1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0]
	for space in spaces:
		if spaces[space_num] == 1:
			return "This spot is not available"
		elif spaces[space_num] == 0:
			return "Space secured"
			spaces[space] = 1

def space_leaving(slot_num):		
	spaces = [1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0]
	if type(slot_num) == str or type(slot_num) == bool:
		raise ValueError("Invalid Data Type")

	for space in spaces:
		spaces[space] = slot_num
		if spaces[space] == 0:
			return "There is no car parked here"
		elif spaces[space] == 1:
			return "Your car is available, Thank you for using our services"
			spaces[space] = 0