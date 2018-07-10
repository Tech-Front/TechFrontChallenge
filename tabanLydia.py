class Darasa(object):

    def __init__(self, name, members):
        self.name = name
        self.members = members

    def addClassMember(self, name):
        members = self.members
        if name not in members:
            members.append(name)
        else:
            print ("Oops! The member already exists")
        return name

    def removeClassMember(self, name):
        members = self.members
        if name in members:
            members.remove(name)
        else:
            print ("Oops! That member doesn't exist")
        return name

    def getDarasaMembers(self):
        show = self.members
        print(show)
        return show



myClass = Darasa('myClass', ["Timothy", "Mary"])
myClass.addClassMember('Mikey')
myClass.removeClassMember('Camy')
myClass.getDarasaMembers()
