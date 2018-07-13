from tabanLydia import Darasa


class Shule(object):
    def __init__(self, schoolName, darasa):
        self.shule = {'className': Darasa, 'shuleName': schoolName}
        self.darasa = darasa

    def addDarasa(self, schoolName, darasa, shule):
        self.darasa = Darasa 
        self.schoolName = schoolName

        if darasa not in schoolName:
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

    def getShule(self, darasa, schoolName):
        self.darasa = Darasa
        shule = {'className': Darasa, 'shuleName': schoolName}
        for schoolName in shule:
            return shule

mySchool = Shule('Light Academy', Darasa('Standard1', ["Mike", "Anna"]))
mySchool.addDarasa('Light Academy', 'Standard2', ["Kyle", "Kimmie"])
mySchool.addDarasa('Light Acadmey', 'Standard3', ["Hayley", "Matt"])
mySchool.getShule('Standard 2', 'Light Academy' )