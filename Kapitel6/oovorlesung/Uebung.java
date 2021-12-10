package oovorlesung;

public class Uebung extends Veranstaltung {

	Student[] students = new Student[20];

	public Uebung(String name) {
		super(name);
		// this.students = new Student[20];

	}

	// public void print() {
	// System.out.println(this.name);
	// }

}

// Erstellen Sie eine Klasse�Uebung die von der Klasse Veranstaltung erbt:
// Schreiben Sie einen Konstruktor f�r die Klasse Uebung. Bei der Erzeugung wird
// die maximale Anzahl der Teilnehmer auf 20 gesetzt.
// �berschreiben Sie die Methode print(). Die Methode soll den Typ der
// Veranstaltung (Uebung), den Namen und den Dozenten ausgeben.
// F�hren Sie folgende Aktionen in der Klasse HTWTest durch:
// Lassen Sie sich die Kapazit�t der Veranstaltung anzeigen
// Testen Sie Ihre Methode print()
// Erstellen Sie 3 Studenten und lassen Sie diese die Uebung belegen.
