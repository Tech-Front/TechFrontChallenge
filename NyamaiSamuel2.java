/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darasa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
                   int studentindex = classmembers_array.indexOf(classmembers_array3);
                   ++studentindex;
                System.out.println(String.valueOf(studentindex) + " :" + classmembers_array3);
                }

    }
    public static void main(String[] args) {
        Darasa standard1= new Darasa();
        standard1.addClassMember("Samuel");
        standard1.addClassMember("Nyamai");
        standard1.addClassMember("Muthui");
        standard1.addClassMember("Chuckie");
        standard1.addClassMember("chan");
        standard1.addClassMember("chan");
        standard1.removeClassMember("Nyamai");
        standard1.getDarasaMembers();
        Darasa standard2  = new Darasa();
        standard2 .addClassMember("ab");
        standard2 .addClassMember("cd");
        standard2 .addClassMember("ef");
        standard2 .addClassMember("lm");
        standard2 .addClassMember("op");
        standard1 .getDarasaMembers();
        standard2 .getDarasaMembers();
        Darasa standard3  = new Darasa();

        Shule mixed_shule = new Shule("Imaculate");
        mixed_shule.addDarasa("Grade 1", standard1);
        mixed_shule.addDarasa("Grade 2", standard2);
        mixed_shule.addDarasa("Grade 3", standard3);
        mixed_shule.removeDarasa("tatu");
        mixed_shule.getShule();
        
        
               
                
    }
    public static class Shule
    {
        String shuleName ;
        public Shule (String shuleName )
        {
            this.shuleName  = shuleName ;
        }
        Map <String , Darasa >shule = new HashMap<>();
         public void addDarasa(String name,Darasa darasa){
             shule.put(name, darasa);
         }
         public void removeDarasa(String name){
             shule.remove(name);
         }
         public Map <String , Darasa > getShule()
         {
             System.out.println("School name is " + shuleName );
             for (Map.Entry<String, Darasa> entry : shule.entrySet()) {
    String key = entry.getKey();
    Darasa values = entry.getValue();
                 System.out.println("Class name is " + key + "\nClass Members are:");
                 values.getDarasaMembers();
    
             }
             
             return shule;
         }
   
    }
    
}
