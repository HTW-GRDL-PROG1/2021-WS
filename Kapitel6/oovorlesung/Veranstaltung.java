package oovorlesung;

public class Veranstaltung {

	String name;
	Dozent dozent;
	Student[] students = new Student[40];

	public Veranstaltung(String name) {
		this.name = name;
	}

	public int getKapazitaet() {
		return this.students.length;
	}

	public boolean belege(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				return true;
			}
		}
		return false;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(dozent.getLastName());
	}

	public void printTeilnehmer() {
		for (Student elem : students) {
			System.out.println(elem);
		}
	}

}
