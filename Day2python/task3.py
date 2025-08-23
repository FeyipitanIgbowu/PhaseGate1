names = []
def array_function(name):
	if type(name)!= str:
		raise ValueError("Invalid Datatype")
		
	if len(names) == 0:
			return "No one likes this"

	for name in names:
		if len(names) == 1:
			return name[0] + "likes this"
		elif len(names) == 2:
			return name[0], name[1] + "likes this"
		elif len(names) == 3:
			return name[0], name[1], name[2] + "likes this"
		elif len(names) > 3:
			return name[0], name[1], +"and", names.length - 2 ,"likes this"
	return name

