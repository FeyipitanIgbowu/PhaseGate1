import unittest
import task1

class TestAgeComparison(unittest.TestCase):

	def test_for_noninteger_data_type(self):
		self.assertRaises(ValueError,task1.age, "Feyi" , "Eloka")

	def test_for_correct_answer(self):
		user_input = task1.age(50, 10)
		self.assertEqual(user_input, 30)
	
	def test_for_zero_input(self):
		self.assertRaises(ValueError,task1.age, 0,0)

	def test_for_negative_input(self):
		self.assertRaises(ValueError,task1.age, -3, -5)
		
	def test_for_impossible_fathers_age_input(self):
		user_input = task1.age(15, 10)
		self.assertEqual(user_input,-5)
	
	def test