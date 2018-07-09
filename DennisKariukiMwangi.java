/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techfront;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kevo
 */
public class TechFront {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Shule yetu=new Shule("Yetu ndiyo shule");
        
        ArrayList<String> sample_members=new ArrayList();
        sample_members.add("Dennis");
        sample_members.add("Joyce");
        sample_members.add("Maingi");
        
        /*Creating the instances of Darasa*/
        Darasa standard1=new Darasa(sample_members);
        Darasa standard2=new Darasa(sample_members);
        Darasa standard3=new Darasa(sample_members);
        
        /*Start addition of members*/
        standard1.addClassMember("Kelvin");
        standard3.addClassMember("Douglas");
        standard2.addClassMember("Ivy");
        
        /*test the removal of members*/
        standard3.removeClassMember("Joyce");
        
        /*Add classes to the school*/
        yetu.addDarasa("standard1", standard1);
        yetu.addDarasa("standard2", standard2);
        yetu.addDarasa("standard3", standard3);
        
        /*test the removal of class*/
        yetu.removeDarasa("standard1");
        
    }
    
    //Representation of a school Shule
    private static class Shule{
        
        private String shule;
        Map<String, Darasa> madrasa = new HashMap<>();

        
        public Shule(String name){
            this.shule=name;
        }
        
        /*A method to convert the java objects to a python equivalence of a dictionary
        The technique adds all classes to a hashmap.
        */
        public Shule toDict(Shule shule){
          return shule;
        }
        
        public Shule addDarasa(String name,Darasa daro){
            this.madrasa.put(name,daro);
            return this.toDict(this);
        }
        
        
        public void removeDarasa(String name){
            this.madrasa.remove(name);
        }
        
        public Shule getShule(){
            return this.toDict(this);
        }
        
    }
    
    
    //Representation of a classroom Darasa
    private static class Darasa {
    
        private ArrayList<String> members;

        public Darasa(ArrayList<String> members){
            this.members=members;
        }

        public void addClassMember(String member){
            if(Arrays.asList(this.members).contains(member))
                System.out.println("The member already exists");

            else
                this.members.add(member);

        }

        public void removeClassMember(String name){
            for (int i = 0; i < this.members.size(); i++) {
                if(this.members.get(i).equals(name)){
                    this.members.remove(i);
                }
            }
        }

        public ArrayList<String> getDarasaMembers(){
            return this.members;
        }

    }
    
}
