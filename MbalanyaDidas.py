#Python 3.7.0

class Darasa:

	def __init__(self,name):
		self.name = name
		self.members = []

		

	def addClassMember(self,newname):
		if newname not in self.members:
			self.members.append(newname)
		else:
			pass

	def removeClassMember(self,oldname):
		if oldname in self.members:
			self.members.delete(oldname)

	def getDarasaMembers(self):
		print (self.members)


Standard1 = Darasa("class1")
Standard1.addClassMember("Joe")
Standard1.addClassMember("Jim")
Standard1.getDarasaMembers()

Standard2 = Darasa("class2")
Standard2.addClassMember("Joey")
Standard2.addClassMember("Joan")
Standard2.getDarasaMembers()

Standard3 = Darasa("class3")
Standard3.addClassMember("Ben")
Standard3.addClassMember("Lisa")
Standard3.getDarasaMembers()


"""
class Shule:
        shule = {}

        def __init__(self,name,Darasa):
                self.shuleName = name

        def addDarasa(self):
                pass
        def removeDarasa(self):
                pass
                """
        

