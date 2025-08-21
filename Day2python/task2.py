def score(score_one, score_two, score_three):
	if type(score_one) != int or type(score_two) != int or type(score_three) != int:
		raise ValueError("Invalid Input Type")
	
	average = score_one + score_two + score_three
	if 90 <= average <= 100:
		return 'A'
	elif 80 <= average < 90:
		return 'B'
	elif 70 <= average < 80:
		return 'C'
	elif 60 <= average < 70:
		return 'D'
	elif 0 <= average < 60:
		return 'F'
	return average
		
	

