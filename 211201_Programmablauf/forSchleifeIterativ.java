public class forSchleifeIterativ {

	/**
	 * Befüllen eines Arrays mit Werten auf zwei Varianten
	 * 1. Variante: mit for-Schleife
	 * 2. Variante: iterativ
	 * 
	 * Beide Varianten liefern das gleiche Ergebnis!
	 */
	public static void main(String[] args) {

		int[] neuesArray = new int[4];
		// neuesArray
		// [0][0][0][0]

		int laengeDesArrays = neuesArray.length;

		// Befüllen des Arrays mittels Schleife
		for (int index = 0; i < laengeDesArrays; i++) {
			neuesArray[index] = index;
		}

		// Befüllen des Arrays Iterativ
		int index = 0;
		if (index < laengeDesArrays) {
			neuesArray[index] = index;
		}

		index++; // index + 1 = 1
		if (index < laengeDesArrays) {
			neuesArray[index] = index;
		}

		index++; // index + 1 = 2
		if (index < laengeDesArrays) {
			neuesArray[index] = index;
		}

		index++; // index + 1 = 3
		if (index < laengeDesArrays) {
			neuesArray[index] = index;
		}

		// neuesArray
		// [0][1][2][3]

	}

}
