package oo1;

public class App {
    public static void main(String[] args) {
        // Hier benutzen wir den leeren Konstruktor. Das Objekt `marieke` wird also
        // erzeugt, deren Attribute sind allerdings leer
        Hipster marieke = new Hipster();
        // Dagegen werden hier direkt den `name`, `age` und `gender` vom Objekt
        // `ahmet` gesetzt
        Hipster ahmet = new Hipster("Ahmet", 23, "divers");

        // Wir benutzen den Punkt-Operator, um auf die Methoden des Objekts zuzugreifen
        ahmet.printHipster();

        marieke.setName("Marieke");
        marieke.setAge(10);
        marieke.printHipster();

        // Da statische Methoden (oder Attribute) sich auf die Klasse und nicht auf
        // die einzelnen Objekte beziehen, werden diese nicht über den Objekt-Namen
        // sondern über den Klassen-Namen aufgerufen. Hier: `Hipster.getAnzahlHipster()`
        // und nicht `ahmet.getAnzahlHipster()`
        System.out.println("Anzahl Hipster bei Ahmet:" + Hipster.getAnzahlHipster());
        System.out.println("Anzahl Hipster bei Marieke:" + Hipster.getAnzahlHipster());
        System.out.println("Der Name ist: " + ahmet.getName());
        Hipster robin = new Hipster("Robin", 48, "m");
        // `anzahlHipster` wird hoch gezählt mit jedem neu erstellten Objekt
        System.out.println("Anzahl Hipster:" + Hipster.getAnzahlHipster());

        Fahrzeug auto = new Fahrzeug("vw", "motorisiert", "blau", 8);
        System.out.println(auto.getMarke());

        marieke.setFahrzeug(auto);
        Fahrzeug mariekesGefaehrt = marieke.getFahrzeug();
        System.out.println(mariekesGefaehrt.getMarke());
        System.out.println(mariekesGefaehrt.getFarbe());
        marieke.bemaltFahrzeug();
        System.out.println(marieke.getName() + " hat das Fahrzeug in " + mariekesGefaehrt.getFarbe() + " bemalt.");
    }
}
