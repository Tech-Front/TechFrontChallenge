class Darasa:
    def __init__(self, *students):
        self.students = list(*students)

    def addClassMember(self, name):
        if name in self.students:
            return

        self.students.append(name)
        return name

    def removeClassMember(self, name):
        if name not in self.students:
            return
        
        self.students.remove(name)
        return name

    def getDarasaMembers(self):
        self.students = list(set(self.students))
        return self.students

    def __str__(self):
        self.students = list(set(self.students))
        return str(self.students)

class Shule:
    def __init__(self, name):
        self.shuleName = name
        self._shule = {}
        
    def addDarasa(self, name, darasa):
        self._shule[name] = darasa
        return self._shule

    def removeDarasa(self, name):
        del self._shule[name]
        return self._shule

    def getShule(self):
        return self.shuleName, self._shule

    def __str__(self):
        return str(self.shuleName) + str({k: str(v) for k, v in self._shule.items()})

if __name__ == '__main__':
    chuo = Shule('Front Academy')
    
    standard1 = Darasa(['john', 'peter', 'mary'])
    standard2 = Darasa(['joy', 'fred', 'alice'])
    standard3 = Darasa(['mark', 'gabe', 'stacy'])

    for standard, darasa in (1, standard1), (2, standard2), (3, standard3):
        chuo.addDarasa("standard {}".format(standard), darasa)

    standard1.addClassMember('peter')
    standard2.removeClassMember('mark')
    standard3.getDarasaMembers()[0]

    print(chuo)

