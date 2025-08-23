def age(fathers_age, sons_age):

	if type(fathers_age) != int or type(sons_age) != int:
		raise ValueError("Invalid Data Type")

	if fathers_age == 0 or sons_age == 0:
		raise ValueError("Invalid Input")

	if fathers_age < 0 or sons_age < 0:
		raise ValueError("Invalid Input")

	new_sons_age = sons_age * 2
	result = fathers_age - new_sons_age
	
	if type(result) != int:
		raise ValueError("Invalid Father's age")
	return result
