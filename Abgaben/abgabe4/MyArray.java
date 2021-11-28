package abgabe4;

import java.util.Arrays;

public class MyArray {

	public static void main(String[] args) {

		// Erstelle und initialisiere den Input für die addUp Methode
		double[] inputArray1 = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0 };
		double[] inputArray2 = { 1.0, -1.0, 0.0, 0.0 };

		// Teste die addUp Methode
		System.out.println("Aufgabe 4.1:");
		System.out.println("addUp(" + Arrays.toString(inputArray1) + ") = " + addUp(inputArray1));
		System.out.println("addUp(" + Arrays.toString(inputArray2) + ") = " + addUp(inputArray2));

		// Erstelle und initialisiere den Input für die countBooleans Methode
		boolean[] bs1 = { true, false, true, false, false, false };
		boolean[] bs2 = { false, false, false, false, false, false };

		// Teste die countBooleans Methode
		System.out.println("\nAufgabe 4.2:");
		System.out.println("countBooleans(" + Arrays.toString(bs1) + ") = " + Arrays.toString(countBooleans(bs1)));
		System.out.println("countBooleans(" + Arrays.toString(bs2) + ") = " + Arrays.toString(countBooleans(bs2)));

		// Teste die createNumbers Methode
		System.out.println("\nAufgabe 4.3:");
		System.out.println("createNumbers(8) = " + Arrays.toString(createNumbers(8)));

		// Erstelle und initialisiere den Input für die findIndex Methode
		int[][] inputArray = { { 1, 5, 6, 7 }, { 2, 3, 9 }, { 10, 11, 12 } };

		// Teste die findIndex Methode
		System.out.println("\nAufgabe 4.4:");
		System.out.println("findIndex(inputArray, 13) = " + findIndex(inputArray, 13));
		System.out.println("findIndex(inputArray, 3) = " + findIndex(inputArray, 3));

	}

	/**
	 * Addiert alle Elemente des Arrays auf und gibt die Summe zurück.
	 * 
	 * @param inputArray Der Eingabearray mit double Werten, die aufaddiert werden
	 *                   sollen.
	 * @return Die Summe (double) aller Werte des Eingabearrays
	 */
	public static double addUp(double[] inputArray) {
		double summe = 0;
		for (double x : inputArray) {
			summe += x;
		}
		return summe;
	}

	/**
	 * countBooleans zählt die Anzahl der Vorkommen von true und false im
	 * Eingabearray. Arrays der Größe 0 werden nicht betrachtet,
	 * 
	 * @param inputArray Der Eingabearray bestehend aus booleschen Werten.
	 * @return Der Ergebnisarray der Länge 2. An Indexstelle 0 steht die Anzahl der
	 *         true-Vorkommen. An Indexstelle 1 steht die Anzahl der
	 *         false-Vorkommen.
	 */
	public static int[] countBooleans(boolean[] inputArray) {
		int trueCount = 0;
		int falseCount = 0;
		for (boolean boolscherWert : inputArray) {
			if (boolscherWert) { // if (boolscherWert) ist Äquivalent zu if (boolscherWert == true)
				trueCount++;
			} else {
				falseCount++;
			}
		}

		int[] ergebnisarray = { trueCount, falseCount };

		return ergebnisarray;
	}

	/**
	 * Die Methode kreiert für einen Eingabewert inputValue einen Array gemäß
	 * folgender Regeln: Der Array hat die Länge inputValue. An Indexstelle 0 steht
	 * der Wert 1. An Indexstelle 1 steht der Wert 1. An Indexstelle i steht die
	 * Summe gebildet aus den Werten an Indexstelle i-1 und i-2. Eingabewerte < 2
	 * brauchen Sie nicht zu betrachten.
	 * 
	 * @param inputValue Der Eingabewert, der die Größe des Arrays bestimmt.
	 * @return Das Ergebnisarray
	 */
	public static int[] createNumbers(int inputValue) {

		int[] ergebnisarray = new int[inputValue];
		ergebnisarray[0] = 1;
		ergebnisarray[1] = 1;
		for (int i = 2; i < inputValue; i++) {
			ergebnisarray[i] = ergebnisarray[i - 1] + ergebnisarray[i - 2];
		}
		return ergebnisarray;
	}

	/**
	 * Die Methode liefert den Index des zweidimensionalen Arrays, an dem inputValue
	 * steht. Im zweidimensionalen Array (Eingabe) kommt kein Wert doppelt vor. Wir
	 * der gesuchte Wert im zweidimensionalen Array nicht gefunden, so liefert die
	 * Methode einen leeren String.
	 * 
	 * @param inputArray Der zweidimensionale Array (Eingabe)
	 * @param inputValue Der Wert nach dem gesucht wird
	 * @return der Index an dem der gesuchte Wert steht (falls existent), ein leerer
	 *         String andernfalls.
	 */
	public static String findIndex(int[][] inputArray, int inputValue) {
		for (int i = 0; i < inputArray.length; i++) {
			int[] row = inputArray[i];
			for (int j = 0; j < row.length; j++) {
				if (row[j] == inputValue) {
					return i + "," + j;
				}
			}
		}
		System.out.println("inputValue " + inputValue + " nicht gefunden");
		return "";
	}

}