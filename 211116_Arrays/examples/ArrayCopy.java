package examples;

/**
 * Erstelle eine Methode arrayCopy, die ein integer Array entgegennimmt und eine
 * Kopie des Arrays zurückgibt.
 * 
 * @author Jan Niklas Engel (engelj@htw-berlin.de)
 */
public class ArrayCopy {
    public static void main(String[] args) {

        int[] zahlen = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Das originale Array:");
        for (int zahl : zahlen) {
            System.out.print(zahl + " ");
        }
        System.out.println();

        int[] zahlenKopie = arrayCopy(zahlen);

        System.out.println("\nDas kopierte Array:");
        for (int zahl : zahlenKopie) {
            System.out.print(zahl + " ");
        }

    }

    /**
     * Kopiert ein Array und gibt eine Kopie davon zurück
     * 
     * @param input integer Array beliebiger Länge
     * @return Kopie des input Arrays
     */
    public static int[] arrayCopy(int[] input) {

        // Länge des Arrays 'input'
        int laenge = input.length;

        // Array erzeugen/erstellen
        int[] kopie = new int[laenge];

        // Initialisieren/Befüllen mit Werten
        for (int index = 0; index < laenge; index++) {
            kopie[index] = input[index];
        }
        return kopie;

    }
}
