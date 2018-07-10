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

class Shule:
    def __init__(self, name):
        self.shuleName = name
        self.shule = {}
        
    def addDarasa(self, name, darasa):
        if (len(self.shule) >= 3):
            print("Failed. Only three classes allowed in a school\n")
            print("School Name:" + self.shuleName + "\n")
            for key in self.shule:
                print(key + ": " + str(self.shule[key]) + "\n")
            return self
        else:
            self.shule[name] = darasa
            print("School Name:" + self.shuleName + "\n")
            for key in self.shule:
                print(key + ": " + str(self.shule[key]) + "\n")
            return self

    def removeDarasa(self,name):
        if(self.shule.get(name,1) and len(self.shule) > 0):
            del self.shule[name]
            print("School Name:" + self.shuleName + "\n")
            for key in self.shule:
                print(key + ": " + str(self.shule[key]) + "\n")
            return self
        else:
            print("Failed. No such class exists\n")
            return;
            
    def getShule(self):
        print("School Name:" + self.shuleName + "\n")
        for key in self.shule:
            print(key + ": " + str(self.shule[key]) + "\n")
        return self
    

Silicon_Savannah = Shule("Silicon_Savannah")
standard1 = Darasa()
standard1.addClassMember("Donald Trump")
standard1.addClassMember("Marylin Monroe")
standard1.addClassMember("Ayn Rand")
standard1.addClassMember("Jeff Bezos")
standard1.removeClassMember("Jeff Bezos")
standard2 = Darasa()
standard2.addClassMember("Chris Bosh")
standard2.addClassMember("LeBron James")
standard2.addClassMember("Kevin Durant")
standard1.addClassMember("Stephen Curry")
Silicon_Savannah.addDarasa("standard1", standard1)
Silicon_Savannah.addDarasa("standard2", standard2)
Silicon_Savannah.removeDarasa("standard1")
Silicon_Savannah.getShule()
Silicon_Savannah.addDarasa("standard1", standard1)
standard3 = Darasa()
standard3.addClassMember("Lady Gaga")
standard3.addClassMember("Chris Brown")
standard3.addClassMember("TY Dollar")
Silicon_Savannah.addDarasa("standard3", standard3)
Silicon_Savannah.getShule()


