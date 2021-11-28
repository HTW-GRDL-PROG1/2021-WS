import java.util.Scanner; // Import the Scanner class

/**
 * Implementiert Hangman-Spiel
 */
public class Hangman {
    // Plan:
    // Geheimwort - done
    // User input auslesen und checken - done
    // Falls richtig: Rückmeldung für User - done
    // Anzahl Leben festlegen + Rückmeldung für den User - done

    // Offene TODOs:
    // "Hübschere" Ausgabe vom geratenen Wort (nicht in einander verschmelzende
    // Unterstriche)
    // Gewinnen
    // Verlieren
    // Vernünftige Fehlerbehandlung bei langen Eingaben (grad funktioniert es wenn
    // man mehrere Zeichen eintippt und das erste davon im Wort vorkommt)
    // Falsche Eingaben merken und für den User ausgeben
    // Vorzeitiges Auflösen
    // Nice-to-have: Grafische Umsetzung vom Hangman
    // Nice-to-have: Array (Liste) mit mehreren Wörtern

    public static void main(String[] args) {
        String geheimWort = "Eichhörnchen";
        StringBuffer geratenesWort = new StringBuffer();

        for (int i = 0; i < geheimWort.length(); i++) {
            geratenesWort.append('_');
        }

        // Zum Debuggen:
        // System.out.println("Geratenes Wort: " + geratenesWort.toString());

        int maxAnzahlVersuche = 7;
        int verbleibendeVersuche = maxAnzahlVersuche;

        System.out.println("Willkommen zum Hangman-Spiel");

        for (int i = 0; i < geheimWort.length(); i++) {
            System.out.print("_ ");
        }
        System.out.print('\n');

        System.out.println("Du hast noch " + maxAnzahlVersuche + " Versuche.");

        while (verbleibendeVersuche > 0) {

            System.out.println("Gebe einen Buchstaben ein: ");

            Scanner scanner = new Scanner(System.in); // Create a Scanner object, reading from standard in

            String eingabe = scanner.nextLine(); // Read user input

            if (eingabe.length() > 1) {
                System.out.println("Gib *nur* einen Buchstaben ein!");
            }

            boolean eingabeGefunden = false;

            for (int i = 0; i < geheimWort.length(); i++) {
                if (geheimWort.toLowerCase().charAt(i) == eingabe.charAt(0)) {
                    geratenesWort.setCharAt(i, geheimWort.charAt(i));
                    eingabeGefunden = true;
                }
            }

            System.out.println(geratenesWort.toString());

            if (!eingabeGefunden) {
                verbleibendeVersuche = verbleibendeVersuche - 1;
            }

            System.out.print('\n');
            System.out.println("Du hast noch " + verbleibendeVersuche + " Versuche über.");
        }
    }
}
