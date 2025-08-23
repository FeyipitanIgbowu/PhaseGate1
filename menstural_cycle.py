from datetime import datetime, timedelta
import calendar

def date_collection(month_name, day_number):
	if type(month_name) != str and type(day_number) != int:
		raise ValueError("Invalid Data Type")
		
	if day_number < 0:
		raise ValueError("Zero's are not allowed")
		
	months = list(calendar.month_name)[1:]
	if month_name.capitalize() != months:
		raise ValueError("Invalid Month")
		
	date_conversion = month_name + " " + str(day_number) + " 2025"  
	return datetime.strptime(date_conversion)