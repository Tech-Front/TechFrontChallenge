
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author shie
 */
public class Darasa {

  private static List<String> students = new ArrayList<>();
  
  public static String addMember(String name){
//      int i;
//      for(i = 0; i<students.size(); i++){
//          if(students.get(i) == name){
//              return "member exists";
//          }
//      }
//      students.add(name);   
//       return name;
 if(students.contains(name)){
       return "Member already Exist";
      }else{
        students.add(name);
        return name;
      }
      
  }
  
  public static String removeMember(String name){
      if(students.contains(name)){
          students.remove(name);
          return name;
      }else{
          return "Member Does Not Exist";
      }
        
      
  }

    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);  
           System.out.println("Enter A students name");  
           String name = sc.next();
           String newMember = Darasa.addMember(name);
           
          if(newMember.equals(name)){
              System.out.println("Our new member is "+newMember);
          }else{
               System.out.println(newMember);
          }
           
           System.out.println("Enter the name of the student you wish to remove"); 
           String leavingStudentName = sc.next();
           String leavingStudent = Darasa.removeMember(leavingStudentName);
            if(leavingStudent.equals(leavingStudentName)){
                System.out.println("Our new member is "+leavingStudent);
            }else{
               System.out.println(leavingStudent);
          }
           

         


    }
    
}
