def Distance(num_of_gallons):
	if type(num_of_gallons) != int:
		raise ValueError("Invalid Input Type")
	if num_of_gallons <= 0:
		raise ValueError("Zeros and Negative Numbers Are Not Allowed")
	if (num_of_gallons >= 2):
		return True
	else:
		return False

	
		
	
	