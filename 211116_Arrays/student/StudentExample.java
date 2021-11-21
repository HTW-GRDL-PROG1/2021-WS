package student;

/**
 * Erstelle eine Methode printWinf die alle Studenten aus dem Studiengang "WINF"
 * auf der Konsole ausgibt. Sie können über das '<student>.studiengang' auf den
 * Studiengang und '<student>.matrikelnummer' auf die Matrikelnummer eines
 * Studenten zugreifen.
 * 
 * @author Jan Niklas Engel (engelj@htw-berlin.de)
 */
public class StudentExample {

    public static void main(String[] args) {

        // Create Array of Student
        Student[] students = new Student[10];

        // Initialize Array with students
        students[0] = new Student("01", "INFORMATIK");
        students[1] = new Student("02", "BWL");
        students[2] = new Student("03", "WINF");
        students[3] = new Student("04", "INFORMATIK");
        students[4] = new Student("05", "WINF");
        students[5] = new Student("06", "WINF");
        students[6] = new Student("07", "BWL");
        students[7] = new Student("08", "INFORMATIK");
        students[8] = new Student("09", "WINF");
        students[9] = new Student("10", "WINF");

        printWinf(students);
    }

    /**
     * Gibt die Matrikelnummern aller Winf Studenten aus.
     * 
     * @param students Array mit Studierenden
     */
    public static void printWinf(Student[] students) {

        for (Student student : students) {
            if (student.studiengang == "WINF") {
                System.out.println("Matrikelnummer: " + student.matrikelnummer);
            }
        }

    }
}
