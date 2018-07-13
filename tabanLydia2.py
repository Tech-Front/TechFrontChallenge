from tabanLydia import Darasa


class Shule(object):
    def __init__(self, shuleName):
        self.shuleName = shuleName
        self.shule = {'className': Darasa, 'schoolName': shuleName}

    def addDarasa(self, shuleName, darasa, shule):
        self.darasa = Darasa 
        self.shuleName = shuleName

        if darasa not in shuleName:
            shule.append(Darasa)
        else:
            print ("Oops! That class already exists")
        return shule

    def removeDarasa(self, darasaName, shule):
        self.darasa = darasaName 
        self.shule = shule

        if darasaName in shule:
            shule.remove(darasaName)
        else:
            print ("No such class exists")
        return shule 

    def getShule(self, darasa, shuleName):
        self.darasa = Darasa
        shule = {'className': Darasa, 'shuleName': shuleName}
        for shuleName in shule:
            return shule.items()

#instantiate Shule object as mySchool
mySchool = Shule('Light Academy')
mySchool.addDarasa('Light Academy', 'Standard2', ["Kyle", "Kimmie"])
mySchool.addDarasa('Light Acadmey', 'Standard3', ["Hayley", "Matt"])
mySchool.getShule('Standard 2', 'Light Academy' )