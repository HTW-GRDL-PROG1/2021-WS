package oovorlesung;

public class Dozent {

    String firstName;
    String lastName;
    String title;
    double gehalt;
    String lehrbereich;

    public Dozent() {

    }


    public Dozent(String fName, String lName, String title) {
        this.firstName = fName;
        this.lastName = lName;
        this.title = title;
    }

    public void print() {
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.title);
    }

    public String getLastName() {
        return lastName;
    }

}
