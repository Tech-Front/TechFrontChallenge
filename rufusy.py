def addClassMember(name):
	if name in Darasa:
		print "Student already in list"
	else:
		Darasa.append(name)
		print "Student added"


def removeClassMember(name):
	if name in Darasa:
		Darasa.remove(name)
		print "Student removed"
	else:
		print "Student not found"


def getDarasaMembers():
	if len(Darasa) > 0:
		print "These are the members of darasa"
		for item in Darasa: print(item)
	else:
		print "Darasa has no members"


Darasa = []
maxLengthList = 5 # maximum number of students that can be added

while len(Darasa) < maxLengthList:
	print "Add student by name: "
	name = raw_input()
	addClassMember(name)
print ""
print ""
print "This the student list"
print Darasa

print ""
print ""
print "remove student by name"
name = raw_input()
removeClassMember(name)
print ""
print ""
print "Updated student list"
print Darasa

print ""
print ""
getDarasaMembers();

