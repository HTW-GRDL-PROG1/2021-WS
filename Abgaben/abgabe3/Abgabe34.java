/**
 * Boolesche Ausdrücke
 */
// x1 x2 x3 Ergebnis
// false false false false
// false false true false
// false true false false
// false true true true
// true false false true
// true false true true
// true true false false
// true true true false
public class Abgabe34 {

    /**
     * Die gibt den Wahrheitswert gemäß der vorgegeben Wahrheitstabelle (siehe
     * Beschreibung) zurück.
     * 
     * @param x1 Boolescher Wert
     * @param x2 Boolescher Wert
     * @param x3 Boolescher Wert
     * @return Das Ergebnis gemäß Wahrheitstabelle
     */
    public static boolean boolCheck(boolean x1, boolean x2, boolean x3) {
        // false false false -> false
        if (x1 == false & x2 == false & x3 == false) {
            return false;
        }
        // false false true -> true
        else if (x1 == false & x2 == false & x3 == true) {
            return true;
        }
        // false true false -> false
        else if (x1 == false & x2 == true & x3 == false) {
            return false;
        } else {
            return true;
        }
    }

    // Vergleiche zwei floats
    // Wenn a < b gib true zurück, sonst gibt false zurück
    public static boolean floatCompare1(float a, float b) {
        return (a < b);
    }

    public static boolean floatCompare2(float a, float b) {
        if (a < b) {
            return true;
        } else {
            return false;
        }
    }
}
