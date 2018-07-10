import java.util.HashMap;
import java.util.Map;

public class Shule {

    private String shuleName;

    public Shule(String schoolName) {
        shuleName = schoolName;
    }

    private Map<String, Object> shule = new HashMap<String, Object>();

    public Map<String, Object> addDarasa(String darasaName, Darasa darasa) {
        shule.put(darasaName, darasa);
        return shule;
    }

    public String removeDarasa(String className) {
        shule.remove(className);
        return "Darasa " + className + " removed successfully";

    }

    public Map<String, Object> getShule() {
        return shule;
    }

    public static void main(String[] args) {
        Darasa classOne = new Darasa();
        Darasa classTwo = new Darasa();
        Darasa classTree = new Darasa();

        classOne.addClassMember("Mike");
        classOne.addClassMember("Makali");
        classTwo.addClassMember("Blasio");
        classTwo.addClassMember("Otieno");
        classTree.addClassMember("Wesley");
        classTree.addClassMember("Kijedi");

        System.out.println(classOne.removeClassMember("Mike"));
        Shule scool = new Shule("Egerton");

        System.out.println(scool.addDarasa("Computer Technology", classOne));
        System.out.println(scool.addDarasa("Agriculture", classTwo));
        System.out.println(scool.addDarasa("Biology", classTree));

        System.out.println(scool.getShule());
    }
}