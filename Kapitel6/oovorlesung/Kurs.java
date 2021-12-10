package oovorlesung;

import java.util.Date;

public class Kurs {

    // Attribute

    private String name;
    Dozent dozent;
    private int teilnehmeranzahlMax;
    private String raumNummer;

    private boolean online;

    private Student[] students;

    // Konstruktor
    public Kurs(String n, Dozent d, int t) {
        this.name = n;
        this.dozent = d;
        this.teilnehmeranzahlMax = t;
        this.students = new Student[t];
    }

    // Operationen
    // überprüfen ob noch Platz, dann erst einschreiben
    public void subscribe(Student student) {

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }

    }

    public void printStudents() {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student != null) {
                student.print();
            }
        }
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the dozent
     */
    public Dozent getDozent() {
        return dozent;
    }

    /**
     * @param dozent the dozent to set
     */
    public void setDozent(Dozent dozent) {
        this.dozent = dozent;
    }

    /**
     * @return int return the teilnehmeranzahlMax
     */
    public int getTeilnehmeranzahlMax() {
        return teilnehmeranzahlMax;
    }

    /**
     * @param teilnehmeranzahlMax the teilnehmeranzahlMax to set
     */
    public void setTeilnehmeranzahlMax(int teilnehmeranzahlMax) {
        this.teilnehmeranzahlMax = teilnehmeranzahlMax;
    }

    /**
     * @return String return the raumNummer
     */
    public String getRaumNummer() {
        return raumNummer;
    }

    /**
     * @param raumNummer the raumNummer to set
     */
    public void setRaumNummer(String raumNummer) {
        this.raumNummer = raumNummer;
    }

    /**
     * @return boolean return the online
     */
    public boolean isOnline() {
        return online;
    }

    /**
     * @param online the online to set
     */
    public void setOnline(boolean online) {
        this.online = online;
    }

    /**
     * @return Student[] return the students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

}
