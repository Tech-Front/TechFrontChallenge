import java.util.ArrayList;
import java.util.List;

public class Monaja {

    List<String> darasa = new ArrayList<String>();


    //method to add a new member to the class or reject if member already exist
    public String addClassMember(String name){
        if(darasa.contains(name)){
            return "member already exist please check the name.";
        }else {

            darasa.add(name);
            return "Monaja member added";
        }
    }


    //a method to remove a member of class Monaja and returns message if not found
    public String removeClassMember(String name){
        if(darasa.contains(name)){
            darasa.remove(name);
            return "Monaja member removed from class.";
        }

        return " " + name + " is not a member of Monaja class";
    }

    //a method to return the list of all the darasa class members
    public List<String> getDarasaMembers( ){
            return darasa;
    }


    public static void main(String [] args){
        Monaja newMonaja = new Monaja();
        System.out.println(newMonaja.addClassMember("Monaja"));
        System.out.println(newMonaja.addClassMember("John"));
        System.out.println(newMonaja.addClassMember("Francis"));
        System.out.println(newMonaja.addClassMember("Taban"));
        System.out.println(newMonaja.removeClassMember("Monaja"));
        System.out.println(newMonaja.removeClassMember("Henry"));
        System.out.println(newMonaja.getDarasaMembers());



    }



}
