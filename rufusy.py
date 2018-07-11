class Darasa:
	count = 0
	# add new member to Darasa
	def addClassMember(self,name):
		if name in student_list:
			print "Student already in list"
		else:
			student_list.append(name)
			Darasa.count +=1
			print "Student added"

	# remove existing member from Darasa
	def removeClassMember(self,name):
		if name in student_list:
			student_list.remove(name)
			print "Student removed"
		else:
			print "Student not found"

	# show all members in Darasa
	def getDarasaMembers(self):
		if Darasa.count > 0:
			print "These are the members of darasa"
			for item in student_list: print(item)
		else:
			print "Darasa has no members"

student_list = [] 
student = Darasa()

while Darasa.count < 5:
	print "Enter name"
	name = raw_input()
	student.addClassMember(name)
print ""
print student.getDarasaMembers()
print ""
print "remove student by name"
name = raw_input()
student.removeClassMember(name)
print ""
print student.getDarasaMembers()








	







	














	



