import java.util.ArrayList;
import java.util.List;

public class WanyeeStephen{}
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