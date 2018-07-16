class Darasa(object):
    """initialize the class with a name"""
    def __init__(self):
        """nothing happens"""
    """adds new member to class darasa"""
    def addDarasaMember(self,name):
        if isinstance(name,Darasa) == False:
            name = Darasa()
            return "object created"
        else:
            return "object not found"
		
    """removes member if exists"""
    def __del__(self):
        return "deleted"
	
    def removeDarasaMember(name):
        if isinstance(name,Darasa) == True:
            print("deleting ...")
            del name
            return "object deleted"
        else:
            return "object not found"
    
    """returns the members of the class"""
    def getDarasaMembers(self):
        name = Darasa()
        members = [x for x in dir(name) if not callable(getattr(name, x)) and not x.startswith("__")]
        return members
            



