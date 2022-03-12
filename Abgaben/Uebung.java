
public class Uebung {

	public static void main(String[] args) {

		// boolean res = stringCompare("Hallo.", "Hallo.");
		// System.out.println(res);

		// [1, 2, 10, 3, 4, 5]
		int[] zahlen = new int[] { 1, 2, 10, 3, 4, 5 };
		int[] zahlen2 = { 1, 2, 10, 3, 4, 5 };
		// summe(zahlen);
		System.out.println("Potenz: " + potenz(2, 4));

		/*
		 * displayText();
		 * summe(1, 1);
		 * int c = summe2(2, 2);
		 * System.out.println("Summe2: " + c);
		 * //andereMethode(c);
		 * System.out.println(floatCompare(2.2f, 3.4f));
		 * 
		 * System.out.println(concat("Hallo ", "Welt"));
		 */
	}

	// Erstelle eine Methode displayText()
	static void displayText() {
		System.out.println("Hallo");
	}

	// Erstelle eine Methode summe(a, b) -> print(a + b)
	public static void summe(int a, int b) {
		int c = a + b;
		System.out.println("Das Ergebnis von " + a + "+" + b + " ist gleich " + c);
	}

	// Erstelle eine Methode summe2(a, b) -> a + b
	public static int summe2(int a, int b) {
		// int c = a+b;
		// return c;
		return a + b;
	}

	// Vergleiche zwei Flie�kommazahlen
	// Wenn a < b dann geben wir true zur�ck
	// Wenn a > b dann geben wir false zur�ck
	public static boolean floatCompare(float a, float b) {
		// a=2.2 und b=3.4 -> (a < b) = true
		// return (a < b);
		if (a < b) {
			return true;
		} else {
			return false;
		}
	}

	// Gib true zur�ck, wenn und b gleich sind
	public static boolean stringCompare(String a, String b) {
		return a == b;
	}

	// Verbinde zwei Strings mit der Methode 'concat'
	public static String concat(String a, String b) {
		// String c = a + b;
		// return c;
		return a + b;
	}

	public static int potenz(int a, int pot) {
		// a = 2
		// pot = 4

		// potenziere a mit b
		// 2^0 = 1
		// a^pot : 2^2 = 2*2 = 4
		// a^pot : 2^3 = 2*2*2 = 8
		// a^pot : 2^4 = 2*2*2*2 = 16
		int a_neu = a;

		for (int i = 1; i < pot; i++) {
			a_neu = a_neu * a;
			// 1. a_neu = 2*2 = 4
			// 2. a_neu = 4*2 = 8
			// 2. a_neu = 8*2 = 16
			// 2. a_neu = 16*2 = 32
		}

		return a_neu;
	}

	// int Array [1, 2, 10, 3, 4, 5]
	// String[] Array ["1", "2", "10", "3", "4"]
	public static int summe(int[] zahlen) {

		/*
		 * for-Schleife
		 * 1. Z�hlvariable : int i = 0;
		 * 2. Abbruchbedingung: (i < 10);
		 * int i = 0; -> (i < 10) -> (0 < 10) -> true
		 * int i = 3; -> (i < 10) -> (3 < 10) -> true
		 * int i = 10; -> (i < 10) -> (10 < 10) -> false
		 */
		int anzahlElemente = zahlen.length;

		// Zahlen: [1, 2, 10, 3, 4, 5]
		// Index: [0, 1, 2, 3, 4, 5]
		int ergebnis = 0;
		for (int i = 0; i < anzahlElemente; i++) {
			ergebnis += zahlen[i];
		}

		return ergebnis;
	}
}
