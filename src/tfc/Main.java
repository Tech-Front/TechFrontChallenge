package tfc;

public class Main {
    public static void main(String[] args) {
        // create instance
        Darasa darasa = new Darasa();

        // add members
        darasa.addClassMember("Joseph Sang");
        darasa.addClassMember("James Jones");
        darasa.addClassMember("Liz Wanjiru");

        // remove member
        darasa.removeClassMember("James Jones");

        // retrieve print out class members
        for (String name : darasa.getDarasaMembers()) {
            System.out.println(name);
        }
    }
}
