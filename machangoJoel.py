class Darasa:
    def __init__(self):
        self.members = []
    
    """
    adds a new  member into the Darasa.  
    """
    def addClassMember(self, member):        
        if member in self.members:
            return 'Member exists'
        self.members.append(member)

    """
    remove member from Darasa  
    """
    def removeClassMember(self, member):
        if member in self.members:
            index_ = self.members.index(member)
            return self.members.remove(index_)
        return 'Youre Trying to remove a non existent member'

    """
    get member from Darasa  
    """
    def getDarasaMember(self, member):
        if member in self.members:
            return member
        return 'Not Found'

    """
    get all members from Darasa  
    """
    def getDarasaMembers(self):
        return self.members