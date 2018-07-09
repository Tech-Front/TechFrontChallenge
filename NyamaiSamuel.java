/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darasa;

import java.util.ArrayList;

/**
 *
 * @author Asce
 */
public class Darasa {
    String class_members;
     ArrayList <String> classmembers_array;

    public Darasa ( )
    {
        classmembers_array= new ArrayList<>();
       
    }
    public void addClassMember(String name)
    {
        this.class_members = name;
            Boolean duplicate_notfound=true;

        for (String classmembers_array1 : classmembers_array) {
            if(name.equals(classmembers_array1) )
            {
                System.out.println("Name is " + name + "\n Duplicate is " + classmembers_array1);
                duplicate_notfound =false;
            }        
        }               
        if(duplicate_notfound)   
        {
        classmembers_array.add(name);
               System.out.println("A new class member " + name + " has been added." ); 
               System.out.println("Size is " + classmembers_array.size());  
        }
        
    }
    public void removeClassMember(String name)
    {
        this.class_members = name;
        int index_deleted = 0 ;
        Boolean duplicate_found=false;
        for (String classmembers_array2 : classmembers_array) {
            if(name.equals(classmembers_array2) ){
               index_deleted= classmembers_array.indexOf(classmembers_array2);
               duplicate_found=true;
            }
            else{
                System.out.println("No such entry was found");
            }
        }
        if(duplicate_found)
        {
            classmembers_array.remove(index_deleted);
        }
    }
    public void getDarasaMembers()
    {
                for (String classmembers_array3 : classmembers_array) {
                System.out.println(classmembers_array3);
                }

    }
    public static void main(String[] args) {
        Darasa one= new Darasa();
        one.addClassMember("Samuel");
        one.addClassMember("Nyamai");
        one.addClassMember("Muthui");
        one.addClassMember("Chuckie");
        one.addClassMember("chan");
        one.addClassMember("chan");
        one.removeClassMember("Nyamai");
        one.getDarasaMembers();
        Darasa two = new Darasa();
        two.addClassMember("ab");
        two.addClassMember("cd");
        two.addClassMember("ef");
        two.addClassMember("lm");
        two.addClassMember("op");
        one.getDarasaMembers();
        two.getDarasaMembers();
        
        
        
        

        

    }
    
}
