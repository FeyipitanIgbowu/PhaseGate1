import unittest
import credit_card_validator

class TestCardType(unittest.TestCase):
	def test_for_invalid_data_type_of_date(self):
		self.assertRaises(ValueError,credit_card_validator.card_type,"Feyi")
		
	def test_for_zero_input(self):
		self.assertRaises(ValueError,credit_card_validator.card_type,000000000)

	def test_for_negative_input(self):
		self.assertRaises(ValueError,credit_card_validator.card_type, -1)

	def test_for_invalid_date_in_february(self):
		self.assertRaises(ValueError,credit_card_validator.card_type, 30)

	def test_that_the_function_works(self):
		response = credit_card_validator.card_type("September", 1)
		expected = datetime(2025, 9, 1)
		self.assertEqual(response, expected)
