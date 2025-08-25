def card_type(card_number):
	if len(card_number) >= 13 and len(card_number) <= 16:
		raise ValueError("Invalid Card Number")
		
	if card_number <= 0:
		raise ValueError("Zero's and Negative numbers are not allowed")
	if type(card_number) != int:
		raise ValueError("Invalid Data Type")

	if card_number[0] == "4":
		return "Visa"
	elif card_number[0] == "5":
		return "MasterCard"
	elif card_number[:2] == "37":
		return "American Express"
	elif card_number[0] == "6":
		return "Discover"
	else:
		return "Invalid Card Type"
        
def vailidity_check(card_number):
	if len(card_number) >= 13 and len(card_number) <= 16:
		return "Invalid Card Number"

	digits = []
	for number in card_number:
		digits.append(int(number)) 

	total_sum = 0
	reverse_digits = digits[::-1] 
    
	for digit in range(len(reverse_digits)):
		num = reverse_digits[digit]
        
	if digit % 2 == 1:
		num = num * 2
	if num > 9:
		num = num - 9
		total_sum += num 
	return total_sum % 10 == 0
	
	
def main():
	card_number = input("Enter credit card number: ").strip()
	print(card_type(card_number))
	
	card_number = input("Enter credit card number: ").strip()
	print(vailidity_check(card_number))
		
if __name__ == "__main__":
	main()
	
	
	