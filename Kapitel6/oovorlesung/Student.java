package oovorlesung;

public class Student {

    // 1. Attribute
    private String firstName;
    private String lastName;
    private int matrNr;
    private Notenblatt[] notenblatt;
    String courseOfStudy;
    int semester;

    // 2. Konstruktor
    public Student(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
        this.notenblatt = new Notenblatt[10];
    }

    // 3. Operation / Methoden

    public Notenblatt[] getNotenblatt() {
        return notenblatt;
    }

    public void setNotenblatt(Notenblatt[] notenblatt) {
        this.notenblatt = notenblatt;
    }

    public void addNotenblatt(Notenblatt notenblatt) {
        for (int i = 0; i < this.notenblatt.length; i++) {
            if (this.notenblatt[i] == null) {
                this.notenblatt[i] = notenblatt;
                break;
            }
        }
    }

    // returns the avg of all Notenblatt.Note
    public double GPA() {
        var gpa = 0.0;
        for (int i = 0; i < notenblatt.length; i++) {
            if (notenblatt[i] != null) {
                gpa += notenblatt[i].getNote();
            }
        }
        var modules = getRegisteredModules();
        gpa = gpa / modules;
        return gpa;
    }

    public int getRegisteredModules() {
        var registered = 0;
        for (int i = 0; i < notenblatt.length; i++) {
            if (notenblatt[i] != null) {
                registered += 1;
            }
        }
        return registered;
    }

    /**
     * prints all attributes
     */
    public void print() {
        System.out.println(firstName + " " + lastName);
        System.out.println(matrNr);
        System.out.println(courseOfStudy);
        System.out.println(semester);
        System.out.println("laenge: " + this.notenblatt.length);
        this.printNotenblaetter();
        System.out.println("gpa: " + this.gpa2());
    }

    public double gpa2() {
        double gpa = 0;
        for (int i = 0; i < notenblatt.length; i++) {
            if (notenblatt[i] == null) {
                break;
            }
            gpa = gpa + notenblatt[i].getNote();
        }
        gpa = gpa / angemeldeteModule();

        return gpa;
    }

    public int angemeldeteModule(){
        int module = 0;
        for (int i = 0; i < notenblatt.length; i++) {
            if (notenblatt[i] != null) {
                module +=1;
            }
        }
        return module;
    }

    public void printNotenblaetter() {
        for (int i = 0; i < notenblatt.length; i++) {
            if (notenblatt[i] != null) {
                this.notenblatt[i].print();
            }
        }
    }

    /**
     * Changes the course of study
     *
     * @param newCourseofStudy The new course of study
     */
    public void changeCourseOfStudy(String newCourseofStudy) {
        this.courseOfStudy = newCourseofStudy;
    }

    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return int return the matrNr
     */
    public int getMatrNr() {
        return matrNr;
    }

    /**
     * @param matrNr the matrNr to set
     */
    public void setMatrNr(int matrNr) {
        this.matrNr = matrNr;
    }

}
