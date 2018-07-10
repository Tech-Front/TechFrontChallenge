# TechFrontChallenge

1. Fork this repository into your computer

 # Coding Assignment


# Part 1

In your favorite language, create an abstract data type representing a class( School class) 
Name it Darasa. Darasa should be constructed using a list of strings representing class members. 

Darasa should have methods with specifications as described:
Function specifications have been listed above the methods to be implemented. 

```
'''
adds a new  member into the Darasa. 
This method does not allow for duplicate Darasa members. If this member exists, handle it 
as you please. 
arguments: String name 
returns: Darasa member added or something else if member exists 
'''
def addClassMember(name):




'''
removes member from this Darasa. 
If member does not exist in the Darasa, handle it as you please. 
Arguements: String name
returns: Darasa member removed from class or something else if member does not exist
'''
def removeClassMember(name):





'''
returns the members of this class
'''
def getDarasaMembers(name):




```

implement these in a file labelled with your lastName, firstName. eg. techFront.py or techFront.java
submit a pull request for this part of the assignment

# Part 2

Now we have a representation of a class: ```Darasa```. If you completed part 1 of the assignment, congratualations! If not, sleeves 
up!

We want to have a school registry representing all members of the school. We will call this ```Shule```. ```Shule``` will represent a school. 

Since we don't have an actual school to represent, let's fake some data for our school!

Create three ```Darasa``` instances( Our school will have only 3 ```Darasa```'s representing standard1, standard2 and standard3), ofcourse it
would be ideal if you named the instances  ```standard1```, ```standard2``` and ```standard3``` - but feel free to call them any other descriptive 
variable names. 

Create an abstract data type called ```Shule```. ```Shule``` will be constructed by passing in a string, representing the name of the school. 
```Shule``` should have a private field ```shule```, a dictionary mapping  of  String className to a Daraasa Instance. It should 
also have ```shuleName``` the name of the school.   
 
```Shule``` should have methods with specifications as described:
Function specifications have been listed above the methods to be implemented. 


```
'''
adds a darasa to the school Registy 
returns the modified dictionary representation of the school.
arguements: String darasaName, Darasa darasa
returns Dictionary representation of school
'''
def addDarasa(name, darasa):





'''
removes a darasa entry from the school Registry. 
arguements: String DarasaName 
returns: modified Dictionary representation of school
'''
def removeDarasa(name): 





'''
returns an unmodifieable array of shuleName and Dictionary representation of Shule
'''
def getShule():

```

Add the three ```Darasa```'s you created to a new instance of ```Shule```

Do something interesting with the two data types you just created (Optional) 

Submit a pull request. 

CONGRATS! YOU'RE Done. 
