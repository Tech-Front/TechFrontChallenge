
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author shie
 */
public class Darasa {

  private static List<String> students = new ArrayList<>();
  
  public static String addClassMember(String name){
    if(students.contains(name)){
        return "Member already Exist";
        }else{
            students.add(name);
            return name;
        }
      
  }
  
  public static String removeClassMember(String name){
      if(students.contains(name)){
          students.remove(name);
          return name;
      }else{
          return "Member Does Not Exist";
      }
        
      
  }

  public static List getClassMembers(){
      return students;
  }

    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);  
           System.out.println("Enter A students name");  
           String name = sc.next();
           String newMember = Darasa.addClassMember(name);
           
          if(newMember.equals(name)){
              System.out.println("Our new member is "+newMember);
          }else{
               System.out.println(newMember);
          }
           
           System.out.println("Enter the name of the student you wish to remove"); 
           String leavingStudentName = sc.next();
           String leavingStudent = Darasa.removeClassMember(leavingStudentName);
            if(leavingStudent.equals(leavingStudentName)){
                System.out.println("Our new member is "+leavingStudent);
            }else{
               System.out.println(leavingStudent);
          }
            System.out.println("Class Members Are");
            System.out.println(Darasa.getClassMembers());


    }
    
}
