package abgabe4;

import java.util.Arrays;

public class MyArray {

	public static void main(String[] args) {
		double[] inputArray1 = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0 };
		double[] inputArray2 = { 1.0, -1.0, 0.0, 0.0 };

		System.out.println(addUp(inputArray1)); // 36.0
		System.out.println(addUp(inputArray2)); // 0.0

		boolean[] bs1 = { true, false, true, false, false, false };
		boolean[] bs2 = { false, false, false, false, false, false };

		System.out.println(Arrays.toString(countBooleans(bs1))); // [2, 4]
		System.out.println(Arrays.toString(countBooleans(bs2))); // [0, 6]

		System.out.println(Arrays.toString(createNumbers(8))); // [1, 1, 2, 3, 5, 8, 13, 21]

		int[][] inputArray = { { 1, 5, 6, 7 }, { 2, 3, 9 }, { 10, 11, 12 } };
		System.out.println(findIndex(inputArray, 13)); // ""
		System.out.println(findIndex(inputArray, 3)); // "1,1"

	}

	/**
	 * Addiert alle Elemente des Arrays auf und gibt die Summe zurück.
	 * 
	 * @param inputArray Der Eingabearray mit double Werten, die aufaddiert werden
	 *                   sollen.
	 * @return Die Summe (double) aller Werte des Eingabearrays
	 */
	private static double addUp(double[] inputArray) {
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
	 * @param inputArray Der Eingabearray bestehend aus booleschen Werte.
	 * @return Der Ergebnisarray der Länge 2. An Indexstelle 0 steht die Anzahl der
	 *         true-Vorkommen. An Indexstelle 1 steht die Anzahl der
	 *         false-Vorkommen.
	 */
	private static int[] countBooleans(boolean[] inputArray) {
		int true_count = 0;
		int false_count = 0;
		for (boolean bool : inputArray) {
			if (bool) {
				true_count++;
			} else {
				false_count++;
			}
		}

		int[] Ergebnisarray = { true_count, false_count };

		return Ergebnisarray;
	}

	/**
	 * Die Methode kreiert für einen Eingabewert inputValue einen Array gemäß
	 * folgender Regeln: Der Array hat die Länge inputValue. An Indexstelle 0 steht
	 * der Wert 1. An Indexstelle 1 steht der Wert 1. An Indexstelle i steht die
	 * Summe gebildet aus den Werten an Indexstelle i-1 und i-2. Eingabewerte < 2
	 * brauchen Sie nicht zu betrachten.
	 * 
	 * @param inputValue Der Eingabewert, der die Größe des Arrays bestimmt.
	 * @return Der Ergebnisarray
	 */
	private static int[] createNumbers(int inputValue) {

		int[] Ergebnisarray = new int[inputValue];
		Ergebnisarray[0] = 1;
		Ergebnisarray[1] = 1;
		for (int i = 2; i < inputValue; i++) {
			Ergebnisarray[i] = Ergebnisarray[i - 1] + Ergebnisarray[i - 2];
		}
		return Ergebnisarray;
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
	private static String findIndex(int[][] inputArray, int inputValue) {
		for (int i = 0; i < inputArray.length; i++) {
			int[] row = inputArray[i];
			for (int j = 0; j < row.length; j++) {
				if (row[j] == inputValue) {
					return i + "," + j;
				}
			}
		}
		return "";
	}

}