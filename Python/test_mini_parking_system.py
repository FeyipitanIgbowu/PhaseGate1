import unittest
import mini_parking_system

class TestParkingSystem(unittest.TestCase):
	def test_for_invalid_data_type_of_spaces(self):
		self.assertRaises(ValueError,mini_parking_system.parking_spaces,"Feyi")

	def test_for_free_space(self):
		response = mini_parking_system.space_availability(3)
		self.assertEqual(response,"Space secured")
		
	def test_for_taken_space(self):
		response = mini_parking_system.space_availability(0)
		self.assertEqual(response,"This spot is not available")

	def test_for_availability_of_space(self):
		response = mini_parking_system.space_leaving(1)
		self.assertEqual(response,"Your car is available, Thank you for using our services")

	def test_for_availability_of_space2(self):
		response = mini_parking_system.space_leaving(0)
		self.assertEqual(response,"There is no car parked here")
		
	def test_for_negative_input_for_free_space(self):
		response = mini_parking_system.space_availability(-1)
		self.assertEqual(response,"Space secured")

	def test_for_negative_input_for_taken_space(self):
		response = mini_parking_system.space_availability(-2)
		self.assertEqual(response,"This spot is not available")
		
	def test_for_negative_input_for_taking_car(self):
		response = mini_parking_system.space_leaving(-3)
		self.assertNotEqual(response,"There is no car parked here")

	def test_for_invalid_data_type_of_slot_num(self):
		self.assertRaises(ValueError,mini_parking_system.space_leaving,"Feyi")

	def test_for_invalid_data_type_of_slot_num2(self):
		self.assertRaises(ValueError,mini_parking_system.space_leaving,True)

	
		
