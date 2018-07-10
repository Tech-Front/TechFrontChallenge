package tfc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SangJoseph {
    public static void main(String[] args) {
        // create instances
        Darasa standard1 = new Darasa();
        Darasa standard2 = new Darasa();
        Darasa standard3 = new Darasa();

        // add members
        standard1.addClassMember("Githeko");
        standard1.addClassMember("Muschiri");

        standard2.addClassMember("Wambugu");
        standard2.addClassMember("Kamande");

        standard3.addClassMember("Joseph");
        standard3.addClassMember("Kibet");

        // create school
        Shule hillSchool = new Shule("Hill School");
        // add darasas
        hillSchool.addDarasa("Standard 1", standard1);
        hillSchool.addDarasa("Standard 2", standard2);
        hillSchool.addDarasa("Standard 3", standard3);

        // display all classes and students
        List list = hillSchool.getShule();
        System.out.println("School: " + list.get(0));
        HashMap dictionary = (HashMap<String, Darasa>) list.get(1);
        System.out.println("--");
        Iterator iterator = dictionary.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            System.out.println("Class: " + pair.getKey());
            Darasa darasa = (Darasa) pair.getValue();
            for (String name : darasa.getDarasaMembers()) {
                System.out.println(name);
            }
            System.out.println("--");
        }
    }
}
