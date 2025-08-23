import unittest
import task_four

class TestDistanceToPump(unittest.TestCase):
	def test_for_data_type(self):
		self.assertRaises(ValueError,task_four.Distance,"Feyi")

	def test_for_correct_result(self):
		user_input = task_four.Distance(4)
		self.assertEqual(user_input,True)

	def test_for_zero_input(self):
		self.assertRaises(ValueError,task_four.Distance,0)
		
	def test_for_negative_input(self):
		self.assertRaises(ValueError,task_four.Distance,-1)
		
	def test_for_float_input(self):
		self.assertRaises(ValueError,task_four.Distance,3.3)

