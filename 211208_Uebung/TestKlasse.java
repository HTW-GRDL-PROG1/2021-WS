public class TestKlasse {
    public static void main(String[] args) {

        // Typ (Superhero) und Bezeichner der Variable 'held'
        Superhero cptnA;

        // Erzeugen eines Superhelden mit 'new'
        cptnA = new Superhero("Captain", "America", 1967);

        // Gib Captain America einen Companion/Gefährten
        cptnA.setCompanion("Wolf");

        // Zugriff auf Eigenschaften des Helden via '.'. Gib Vorname, Nachname aus
        System.out.println(cptnA.firstName + " " + cptnA.lastName + " " + cptnA.companion);

        System.out.println("Kontostand (herocoins): " + cptnA.getHerocoins());

        // Gib Captain America 50 herocoins
        cptnA.addHerocoins(50);

        System.out.println("Kontostand (herocoins): " + cptnA.getHerocoins());

        // Erzeuge Array mit dem Typ Superhero, das Array kann 10 Superhelden fassen
        Superhero[] team = new Superhero[10];
        team[7] = cptnA;

        Superhero spiderman = new Superhero("Peter", "Parker", 1999);
        team[1] = spiderman;
        // Funktioniert
        // team[2] = new Superhero("Vorname", "Nachname" 1234);

        // Entferne den Superhelden an Stelle 0 aus unserem Team
        team[0] = null;

        for (int i = 0; i < team.length; i++) {
            System.out.println("Team an Stelle " + i + ": " + team[i]);
        }

        deleteSuperhero("Captain", "America", team);
    }

    public static void deleteSuperhero(String firstName, String lastName, Superhero[] team) {

        System.out.println("Hallo I bims in deleteSuperhero");

        // Wir wissen nicht wo der im team sich der Held firstName lastName befindet
        // Folglich müssen wir schauen, an welcher Stelle im team der Held ist
        // -> for-Schleife
        for (int i = 0; i < team.length; i++) {
            Superhero heldAnStelleI = team[i];

            if (heldAnStelleI == null) {
                // Brich den aktuellen Durchlauf der for-Schleife ab und starte den nächsten
                continue;
            }

            if (heldAnStelleI.getFirstName() == firstName) {
                // Wir wissen an dieser Stelle, dass der Vorname des heldAnStelleI
                // dem gesuchten Vornamen entspricht
                if (heldAnStelleI.getLastName() == lastName) {
                    // Wir wissen an dieser Stelle, dass der Nachname und der Vorname des
                    // heldAnStelleI
                    // dem gesuchten Nachnamen und der Vornamen entspricht.
                    System.out.println("Team an Stelle " + i + ": " + team[i]);
                    team[i] = null;
                    System.out.println("Team an Stelle " + i + ": " + team[i]);
                }
            }

        }
    }
}
