import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


class Darasa{
    List <String> members = new ArrayList<>();

    /*
     * adds a new member into the Darasa. This method does not allow for duplicate Darasa members. 
     * @param String name 
     * @return Darasa member added or something else if member exists
    */
    public String addClassMember(String name){
        if(members.contains(name)){
            return "Darasa member with current name already exists";
        }else{
            members.add(name);
            return "Darasa member added";
        }
    }
    
    /*
    * removes member from this Darasa class
    * @param String name to be removed
    * @return String response
    */
    public String removeClassMember(String name){
        if(members.contains(name)){
            members.remove(name);
            return "Darasa member removed";
        }else{
            return "Darasa member does not exist";
        }
    }
    
    /*
    * @return List of members in Darasa
    */

    public List<String> getDarasaMembers() {
        return members;
    }    

}
    

class Shule{
    private String shuleName;

    public String getShuleName() {
        return shuleName;
    }
    private Map<String, Darasa> shule = new LinkedHashMap<>();
    
    public Shule(String shuleName){
        this.shuleName = shuleName;
    }
    
    /*
    * adds a darasa to the school registry
    * @param String darasaName
    * @param Darasa darasa
    * @return Map shule - dictionary representation of the school
    */
    public Map addDarasa(String darasaName, Darasa darasa){
        if(!shule.containsKey(darasaName)){
            shule.put(darasaName, darasa);
            System.out.println("Darasa: "+darasaName+" added successfully");
        }else{
            System.out.println("Darasa: "+darasaName+" already exists");
        }
        return shule;
    }
    
     /*
    * removes a darasa to the school registry
    * @param String darasaName    * 
    * @return Map shule - modified dictionary representation of the school
    */
    public Map removeDarasa(String darasaName){
        if(shule.containsKey(darasaName)){
            shule.remove(darasaName);
            System.out.println("Darasa: "+darasaName+" removed successfully");
        }else{
            System.out.println("Darasa: "+darasaName+" does not exist");
        }
        return shule;
    }
    
    /*
    * Since java does not support associative arrays, maps  come to the rescue
    * @return unmodifiable map view of shuleName and dictionary representation of shule
    */
    public Map getShule(){
        Map<String, Object> schools = new LinkedHashMap<>();
        schools.put(this.shuleName, this.shule);
        
        return Collections.unmodifiableMap(schools);
    }
}


public class WanyeeStephen{
    static String  shuleChoice,darasaChoice;
    static Scanner get = new Scanner(System.in);
    static Shule techFront = new Shule ("TechFront");
    
    public static void main(String[] args) {
        
        //three instances of Darasa
        Darasa standard1 = new Darasa();
        Darasa standard2 = new Darasa();
        Darasa standard3 = new Darasa();
        
        techFront.addDarasa("standard1", standard1);
        techFront.addDarasa("standard2", standard2);
        techFront.addDarasa("standard3", standard3);
        clearConsole();
        
        /*
            A simple program
        */     
        shuleActions(techFront);
        
        clearConsole();        
    }
    
    public static void darasaMenu(){
        System.out.println("---------------Menu----------------");
        System.out.println("1. Add member");
        System.out.println("2. Remove member");
        System.out.println("3. List members");
        System.out.println("0. Back to Main menu");
        System.out.print("Choice: ");
        darasaChoice = get.nextLine();
    }
    
    public static void darasaActions(Darasa darasa, String darasaName){
        clearConsole();
        System.out.println("------- "+darasaName+" ----------");
        darasaMenu();          

        while(!darasaChoice.equals("0")){
            clearConsole();
            String name;
            switch(darasaChoice){
                case "1":
                    System.out.println("----------Add a new member---------------");
                    System.out.print("Enter name of new member: ");
                    name = get.nextLine();
                    System.out.println(darasa.addClassMember(name));
                    break;
                case "2":
                    System.out.println("---------Remove a member----------------");
                    System.out.print("Enter name of  member: ");
                    name = get.nextLine();
                    System.out.println(darasa.removeClassMember(name));
                    break;
                case "3":
                    System.out.println("---------List of Darasa members----------------");
                    List<String> temp = darasa.getDarasaMembers();
                    if(temp.isEmpty()){
                        System.out.println("Darasa has not mebers");
                    }else{
                       for(String member: temp){
                            System.out.println(member);
                        } 
                    }                    
                    break;
                default: 
                    System.out.println("Enter a valid input");
                    break;
             }
            darasaMenu();
        }
    }
    
    public static void shuleMenu(){
        System.out.println("---------------Menu----------------");
        System.out.println("1. Add Darasa");
        System.out.println("2. Remove Darasa");
        System.out.println("3. Edit Darasa");
        System.out.println("4. View Shule");
        System.out.println("0. Exit");
        System.out.print("Choice: ");
        shuleChoice = get.nextLine();
    }
    
    public static void shuleActions(Shule shule){
        clearConsole();
        System.out.println("---------"+shule.getShuleName()+"----------");
        shuleMenu();
        
        while(!shuleChoice.equals("0")){
            clearConsole();
            String darasaName;
            switch(shuleChoice){
                case "1":
                    System.out.println("----------Add a new darasa---------------");
                    System.out.print("Enter name of new darasa: ");
                    darasaName = get.nextLine();
                    shule.addDarasa(darasaName,new Darasa());
                    break;
                case "2":
                    System.out.println("---------Remove a darasa----------------");
                    System.out.print("Enter name of  darasa: ");
                    darasaName = get.nextLine();
                    shule.removeDarasa(darasaName);
                    break;
                case "3":
                    System.out.println("---------Edit a darasa----------------");
                    System.out.print("Enter name of  darasa: ");
                    darasaName = get.nextLine();
                    Map m = (Map) shule.getShule().get(shule.getShuleName());
                    if(m.containsKey(darasaName)){
                        darasaActions((Darasa) m.get(darasaName), darasaName);  
                        clearConsole();
                    }else{
                        System.out.println("Darasa does not exist");
                    }
                    break;
                case "4":
                    System.out.println("--------List Darasas------------------");
                    Map mp = (Map) shule.getShule().get(shule.getShuleName());
                    if(mp.isEmpty()){
                        System.out.println(shule.getShuleName()+ " has no darasas.");
                    }else{
                        for(Object darasas: mp.keySet()){
                            System.out.println(darasas);
                        }
                    }
                    break;                    
                default: 
                    System.out.println("Enter a valid input");
                    break;
             }
            shuleMenu();
        }
    }
    
    public final static void clearConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
            
}