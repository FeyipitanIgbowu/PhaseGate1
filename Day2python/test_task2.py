import unittest
import task2

class TestAgeComparison(unittest.TestCase):
	
	def test_for_noninteger_data_type(self):
		self.assertRaises(ValueError,task2.score, "Feyi" , "Eloka", "Kash")

	def test_for_correct_result(self):
		user_input = task2.score(100, 70, 30)
		self.assertEqual(user_input,'A','C','F')

	