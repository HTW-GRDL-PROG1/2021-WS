package examples;

/**
 * Erstelle eine Methode arrayReverse, die ein Array entgegennimmt und die
 * Position der Element umdreht (Das erste Element kommt an die letzte Stelle,
 * das zweite Element an die Vorletzte, usw.).
 * 
 * @author Jan Niklas Engel (engelj@htw-berlin.de)
 */
public class ArrayReverse {
    public static void main(String[] args) {

        int[] zahlen = { 1, 2, 3, 4, 10, 17, 28, 30, 22, 7 };

        System.out.println("Das Array mit normaler Reihenfolge:");
        for (int zahl : zahlen) {
            System.out.print(zahl + " ");
        }

        arrayReverse(zahlen);

        System.out.println("\nDas Array mit umgedrehter Reihenfolge:");
        for (int zahl : zahlen) {
            System.out.print(zahl + " ");
        }
    }

    /**
     * Dreht die Reihenfolge der Elemente im Eingabearray um
     * 
     * @param zahlen integer Array beliebiger Länge
     */
    public static void arrayReverse(int[] zahlen) {

        int laenge = zahlen.length;

        for (int i = 0; i < laenge / 2; i++) {

            // Speichere die Zahl auf Position i in einer Hilfsvariable
            int hilfsvariable = zahlen[i];
            // Überschreibe die Zahl auf der Position i mit der gegenüberliegenden Zahl
            zahlen[i] = zahlen[laenge - i - 1];
            // Überschreibe die gegenüberliegende Zahl mit der Zahl auf Position i
            zahlen[laenge - i - 1] = hilfsvariable;

        }
    }

}