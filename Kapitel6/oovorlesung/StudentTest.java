package oovorlesung;

public class StudentTest {

	public static void main(String[] args) {

		Student tom = new Student("tom", "barsch");
		tom.print();

		System.out.println("");

		Student sarah = new Student("sarah", "barsch");
		Notenblatt notenblatt = new Notenblatt("prog1", 2);
		sarah.addNotenblatt(notenblatt);
		sarah.addNotenblatt(new Notenblatt("mathe1", 1));
		sarah.print();

	}
}

// Erstellen Sie eine Klasse StudentTest mit einer main-Methode.
// � Erzeugen Sie ein Objekt der Klasse Student und belegen die Objektvariablen
// mit
// Werten.
// � Testen Sie Ihre Methode(n)
