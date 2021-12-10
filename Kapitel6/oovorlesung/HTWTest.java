package oovorlesung;

public class HTWTest {

	public static void main(String[] args) {
		Lehrbeauftragter nam = new Lehrbeauftragter();
		nam.firstName = "nam";
		nam.lastName = "nguyen";

		Professor majuntke = new Professor();
		majuntke.firstName = "verena";
		majuntke.lastName = "majuntke";

		nam.printProfessor();
		nam.setModulverantwortlicher(majuntke);
		nam.printProfessor();
	}

}

// Erstellen Sie eine Klasse HTWTest mit einer main-Methode.
// Erzeugen Sie ein Objekt der Klasse Veranstaltung und belegen die
// Objektvariablen mit Werten. Erzeugen Sie mindestens 3 Studenten und lassen
// Sie diese die Veranstaltung belegen
