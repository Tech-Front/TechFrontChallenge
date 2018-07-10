package tfc;

import java.util.ArrayList;

public class Darasa {
    // list of class members
    ArrayList<String> classMembers;

    public Darasa() {
        // initialize list on instantiation
        classMembers = new ArrayList<>();
    }

    // this method returns true if addition is successful and false otherwise
    public boolean addClassMember(String name) {
        // check if name exists
        if (classMembers.contains(name)) {
            return false;
        } else {
            // add member
            classMembers.add(name);
            return true;
        }
    }

    // this method returns true if removal is successful and false otherwise
    public boolean removeClassMember(String name) {
        // check if name exists
        if (classMembers.contains(name)) {
            // remove member
            classMembers.remove(name);
            return true;
        } else {
            return false;
        }
    }

    // this method returns the members of the class as a list
    public ArrayList<String> getDarasaMembers() {
        return classMembers;
    }
}
