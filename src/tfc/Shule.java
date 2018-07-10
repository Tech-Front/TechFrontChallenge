package tfc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Shule {
    // fields
    private String shuleName;
    private HashMap<String, Darasa> shule;

    // constructor that assigns school name and instantiates dictrionary
    public Shule(String shuleName) {
        this.shuleName = shuleName;
        shule = new HashMap<>();
    }

    // add a darasa and return dictionary representation
    public HashMap<String, Darasa> addDarasa(String darasaName, Darasa darasa) {
        if (shule.containsKey(darasaName)) {
            // if darasa name already exists, do not add
            return shule;
        } else {
            shule.put(darasaName, darasa);
            return shule;
        }
    }

    // remove a darasa and return dictionary representation
    public HashMap<String, Darasa> removeDarasa(String darasaName) {
        shule.remove(darasaName);
        return shule;
    }

    public List getShule() {
        // create a list
        List shuleInfo = new ArrayList();
        // insert school name
        shuleInfo.add(shuleName);
        // insert dictionary of darasas
        shuleInfo.add(shule);
        return shuleInfo;
    }
}
