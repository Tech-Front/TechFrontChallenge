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