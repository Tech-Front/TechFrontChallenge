
package techfrontchallenge;


import java.util.Scanner;


/**
 *
 * @author Michael Se-lunani
 */


public class TechFrontChallenge {
    // declare array to add members
static String member[]= new String[100]; 
// declare index position for the added members
static int position=0;
    /**
     * @param name
     * @param args the command line arguments
     * @return 
     */
public String add_member(String name){
    
  member[position]= name;
   return name;
}
public String remove_member(String element){
    int length=0;
   	for (int i = 0; i < member.length; i++) {
			if(member[i]!=element)
			{
				member[length++]=member[i];
			}
		}
    
    return element;
}
public  void getgetDarasaMembers(){

	for(position=0;position<member.length;position++){
          new TechFrontChallenge().remove_member(member[position]);
          System.out.println(position+":"+member[position]);
      }	
	
}
	
	
    public static void main(String[] args) 
    {
        // TODO code application logic here
        System.out.println("how many members are you adding");
        
        Scanner  input = new Scanner(System.in);
       int all = input.nextInt();
        for(position=0;position<all;position++){
            System.out.println("add new member");
            String new_member = input.next();
            
           String pp= new TechFrontChallenge().add_member(new_member);
            
            
            
        }
        new TechFrontChallenge().getgetDarasaMembers();
     
        
        
       
        
        }
    
}
