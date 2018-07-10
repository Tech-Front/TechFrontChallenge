import java.util.ArrayList;
import java.util.List;

public class Makali {

  List<String> darasa = new ArrayList<String>();

  // add class member
  public String addClassMember(String name) {
    if (darasa.contains(name)) {
      return "member already exist please check the name.";
    } else {

      darasa.add(name);
      return "class member added";
    }
  }

  // Remove class member
  public String removeClassMember(String name) {
    if (darasa.contains(name)) {
      darasa.remove(name);
      return "class member removed from Darasa.";
    }

    return " " + name + " is not a member of Makali class";
  }

  // get class members
  public List<String> getDarasaMembers() { return darasa; }

  public static void main(String[] args) {
    Makali newMakali = new Makali();
    System.out.println(newMakali.addClassMember("Makali"));
    System.out.println(newMakali.addClassMember("John"));
    System.out.println(newMakali.addClassMember("Francis"));
    System.out.println(newMakali.addClassMember("Taban"));
    System.out.println(newMakali.removeClassMember("Makali"));
    System.out.println(newMakali.removeClassMember("Henry"));
    System.out.println(newMakali.getDarasaMembers());
  }
}