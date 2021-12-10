package oovorlesung;

public class Lehrbeauftragter extends Dozent {

    private Professor modulverantwortlicher;

    public Professor getModulverantwortlicher() {
        return modulverantwortlicher;
    }

    public void setModulverantwortlicher(Professor modulverantwortlicher) {
        this.modulverantwortlicher = modulverantwortlicher;
    }

    public void printProfessor() {
        if (this.modulverantwortlicher == null) {
            System.out.println("there is no prof!");
        } else {
            System.out.println("prof is: " + this.modulverantwortlicher.firstName);
        }
    }

}
