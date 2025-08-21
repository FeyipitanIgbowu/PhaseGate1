import unittest
import task3

class TestArrayFunction(unittest.TestCase):
	
	def test_for_data_type(self):
		self.assertRaises(ValueError,task3.array_function,7)

	def test_for_correct_result(self):
		user_input = task3.array_function("Peter")
		self.assertEqual(user_input,"No one likes this" )
