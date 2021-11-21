package examples;

/**
 * Verschiedene Beispiele, wie ein Array erzeugt und initialisiert werden kann
 * 
 * @author Jan Niklas Engel (engelj@htw-berlin.de)
 */
public class ArrayCreation {
	public static void main(String[] args) {

		// Array manuel erzeugen
		int[] manualArray = new int[4];

		manualArray[0] = 1;
		manualArray[1] = 2;
		manualArray[2] = 3;
		manualArray[3] = 4;

		System.out.println("Das Array mit manueller Initialisierung:");
		for (int i = 0; i < manualArray.length; i++) {
			System.out.print(manualArray[i] + " ");
		}
		System.out.println();

		// Array mit for-Schleife initialisieren
		int[] forArray = new int[10];

		System.out.println("\nDas Array mit for-Schleife initialisiert:");
		for (int i = 0; i < forArray.length; i++) {

			// Initialisierung
			forArray[i] = i + 1;

			// Ausgabe
			System.out.print(forArray[i] + " ");
		}
		System.out.println();

		// Array erzeugen und direkt initialisieren
		String[] instantArray = { "abc", "def", "ghi" };

		System.out.println("\nDas Array direkt initialisiert:");
		for (int i = 0; i < instantArray.length; i++) {
			System.out.print(instantArray[i] + " ");
		}

	}
}
