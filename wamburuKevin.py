class Darasa(list):
    def __init__(self):
        list.__init__(self)
    
    def addClassMember(self, name):
        if(len(self) == 0):
            self.append(name)
            print("Member successfully added\n")
            return
        else:
            for i in range(len(self)):
                if (self[i-1] == name):
                    print ("Failed. Member exists\n")
                    break
                    return
                else:
                    self.append(name)
                    print("Member successfully added\n")
                    return
                
    def removeClassMember(self, name):
        for i in range(len(self)):
            if (self[i-1] == name):
                self.remove(name)
                print("Member successfully removed\n")
                break
                return
        print("Failed. Member does not exist\n")
        return
    
    def getDarasaMembers(self):
        for i in range(len(self)):
            print(self[i-1] + "\n")
        return
