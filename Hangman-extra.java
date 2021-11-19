import java.util.Scanner;  // Import the Scanner class

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
    // "Hübschere" Ausgabe vom geratenen Wort (nicht in einander verschmelzende Unterstriche) -> siehe prettyPrintWord()-Methode
    // Gewinnen -> siehe z.37 und z. 80-85
    // Verlieren -> siehe z. 81-95
    // Vernünftige Fehlerbehandlung bei langen Eingaben (grad funktioniert es wenn man mehrere Zeichen eintippt und das erste davon im Wort vorkommt)
    // -> siehe den Code if Eingabe länger als 1 (z.60-61)
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
        //System.out.println("Geratenes Wort: " + geratenesWort.toString());

        int maxAnzahlVersuche = 7;
        int verbleibendeVersuche = maxAnzahlVersuche;
        boolean win = false;

        System.out.println("Willkommen zum Hangman-Spiel");

        //for (int i = 0; i < geheimWort.length(); i++) {
        //    System.out.print("_ ");
        //}
        //System.out.print('\n');
        prettyPrintWord(geratenesWort);
        
        System.out.println("Du hast noch " + maxAnzahlVersuche + " Versuche.");
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object, reading from standard in


        while (verbleibendeVersuche > 0) {

            System.out.println("Gebe einen Buchstaben ein: ");

            String eingabe = scanner.nextLine();  // Read user input

            if (eingabe.length() > 1) {
                System.out.println("Gib *nur* einen Buchstaben ein!");

                // Proper handling of longer inputs: don't check whether input matches but just go back to beginning of while-loop
                continue; // bricht aktueller Durchlauf der while-Schleife ab und macht mit dem nächsten weiter
            }

            boolean eingabeGefunden = false;

            for (int i = 0; i < geheimWort.length(); i++) {
                if (geheimWort.toLowerCase().charAt(i) == eingabe.charAt(0)) {
                    geratenesWort.setCharAt(i, geheimWort.charAt(i));
                    eingabeGefunden = true;
                }
            }

            //System.out.println(geratenesWort.toString());
            prettyPrintWord(geratenesWort);

            if (!eingabeGefunden) {
                verbleibendeVersuche = verbleibendeVersuche - 1;            
            }

            // Überprüfen, ob man das Wort mittlerweile erraten hat
            if (geratenesWort.toString().equals(geheimWort)) {
                System.out.println("Herzlichen Glückwunsch, du hast gewonnen!");
                win = true;
                break; // bricht die while-Schleife komplett ab
            }

            System.out.print('\n');
            System.out.println("Du hast noch " + verbleibendeVersuche + " Versuche über.");
        }

        // Wenn wir außerhalb der while-Schleife kommen, wurde die while-Schleife entweder unterbrochen, weil wir gewonnen haben
        // oder die verbleibendeVersuche sind aufgebraucht und wir haben verloren
        if (!win) {
            System.out.println("Schade. Du hast das Geheimwort nicht erraten. Vielleicht nächstes Mal.");
        }

        scanner.close();

    }

    public static void prettyPrintWord(StringBuffer buffer) {
        for (int i = 0; i < buffer.length(); i++) {
            System.out.print(buffer.charAt(i) + " ");
        }
        System.out.print('\n');
    }

}
