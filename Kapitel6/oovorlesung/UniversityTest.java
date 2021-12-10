package oovorlesung;

public class UniversityTest {

    public static void main(String[] args) {

        Student paul = new Student("Paul", "Mueller");
        paul.courseOfStudy = "Wirtschaftsinformatik";
        paul.setMatrNr(123681);
        paul.semester = 1;

        Student olga = new Student("Olga", "Kosokova");
        olga.courseOfStudy = "Wirtschaftsinformatik";
        olga.setMatrNr(123682);
        olga.semester = 1;

        Student ismail = new Student("Ismail", "Harah");
        ismail.courseOfStudy = "Wirtschaftsinformatik";
        ismail.setMatrNr(123685);
        ismail.semester = 1;

        Student than = new Student("Than", "Nguyen");
        than.courseOfStudy = "Wirtschaftsinformatik";
        than.setMatrNr(123686);
        than.semester = 1;

        Student serail = new Student("Serail", "Conchette");
        serail.courseOfStudy = "Wirtschaftsinformatik";
        serail.setMatrNr(121582);
        serail.semester = 4;

        Student harry = new Student("Harry", "Potter");
        harry.courseOfStudy = "Wirtschaftsinformatik";
        harry.setMatrNr(123695);
        harry.semester = 1;

        Student anna = new Student("Anna", "Karakov");
        anna.courseOfStudy = "Wirtschaftsinformatik";
        anna.setMatrNr(123697);
        anna.semester = 2;

        Professor majuntke = new Professor();
        majuntke.firstName = "Verena ";
        majuntke.lastName = "Majuntke";
        majuntke.title = "Prof. Dr.";
        majuntke.print();

        Kurs grdl = new Kurs("Grundlagen der Programmierung", majuntke, 10);
        grdl.printStudents();
        grdl.subscribe(paul);
        grdl.subscribe(olga);
        grdl.printStudents();

    }

}
