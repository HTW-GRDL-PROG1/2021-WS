package examples;

/**
 * Verschiedene Beispiele, wie ein Array erzeugt und initialisiert werden kann
 * 
 * @author Jan Niklas Engel (engelj@htw-berlin.de)
 */
public class ArrayZero {
    public static void main(String[] args) {

        // 1-dimensionales Array
        int[] arrayMitNullen = arrayZero(20);

        System.out.println("Das neue Array hat die Länge: " + arrayMitNullen.length);

        // Ausgabe über erweiterte for-Schleife
        for (int zahl : arrayMitNullen) {
            System.out.print(zahl + " ");
        }

        // 2-dimensionales Array
        int[][] arrayMitNullen2D = arrayZero2D(5, 5);

        System.out.println("\nDas neue Array hat die Dimensionen: " + arrayMitNullen2D.length);

        // Ausgabe über normale for-Schleife
        for (int row = 0; row < arrayMitNullen2D.length; row++) {
            for (int col = 0; col < arrayMitNullen2D[row].length; col++) {
                System.out.print(arrayMitNullen2D[row][col] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Initialisiert ein Array der Länge n mit Nullen.
     * 
     * @param n Länge des Arrays
     * @return das initialisierte Array
     */
    public static int[] arrayZero(int n) {

        // Array erzeugen
        int[] intArray = new int[n];

        // Initialiserung
        for (int i = 0; i < n; i++) {
            intArray[i] = 0;
        }

        return intArray;

    }

    /**
     * Initialisiert ein Array der Größe n x m mit Nullen.
     * 
     * @param n Länge der ersten Dimension des Arrays
     * @param m Länge der zweiten Dimension des Arrays
     * @return das initialisierte Array
     */
    public static int[][] arrayZero2D(int n, int m) {

        // Array erzeugen
        int[][] intArray = new int[n][m];

        // Initialiserung
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++)
                intArray[row][col] = 0;
        }

        return intArray;

    }
}
