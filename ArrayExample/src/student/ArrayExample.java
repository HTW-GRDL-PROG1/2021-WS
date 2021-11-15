package student;

public class ArrayExample {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Create Array of Student
        Student[] students = new Student[10];

        // Initialize Array with students
        students[0] = new Student(1, "INFORMATIK");
        students[1] = new Student(2, "BWL");
        students[2] = new Student(2, "WINF");
        students[3] = new Student(2, "INFORMATIK");
        students[4] = new Student(2, "WINF");
        students[5] = new Student(2, "WINF");
        students[6] = new Student(2, "BWL");
        students[7] = new Student(2, "INFORMATIK");
        students[8] = new Student(2, "WINF");
        students[9] = new Student(2, "WINF");

    }
}
