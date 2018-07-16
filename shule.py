# -*- coding: utf-8 -*-
"""
Created on Mon Jul 16 2018

@author: Leonard Githigi
"""
from githigiLeonard import Darasa

std1 = Darasa()
std2 = Darasa()
std3 = Darasa()

class Shule(object):
    """class for school peeps"""
    def __init__(self,shuleName,shule,Darasa):
        shuleName = self.shuleName
        shule = dict(self.__shule)
        self.shule = Darasa()

	  def addDarasa(self,name,shule,Darasa):
        """adds a Darasa to the School Registry"""
        self.shuleName = name
        name = self.__shule
        return name
        """removes Darasa Entry"""
    def __del__(self):
        """inbuilt method"""
        return "Deleted"
    def removeDarasa(self,name):
        if isinstance(name,Shule) and isinstance(name,Darasa):
            print("Deleting...")
            del name
        else:
            return "Darasa not found in this Shule"
    def getShule(self,name):
        if isinstance(name,Shule):
            return tuple(name.shuleName,name.__shule)

kiganjo = Shule(std1,std2,std3)


		
		
		