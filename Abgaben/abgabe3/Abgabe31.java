package abgabe3;

import java.util.*;

/**
 * Wiederholung und Lernkontrolle: Methoden (freiwillig)
 */
public class Abgabe31 {
    /**
     * main-Methode Sie liest zwei Eingabewerte von der Konsole und gibt das
     * Ergebnis auf der Konsole aus Diese Klasse berechnet das Ergebnis zweier
     * Eingabewerte über drei verschachtelte Methoden
     * 
     * @param args String-Array für mögliche Startparameter
     */
    public static void main(String[] args) {

        // Eingabe von zwei Werten:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte erste Zahl eingeben: ");
        int eingabe1 = scanner.nextInt();
        System.out.print("Bitte zweite Zahl eingeben: ");
        int eingabe2 = scanner.nextInt();

        // Aufruf zur Berechnung
        // int ergebnis = methode1(eingabe1, eingabe2);

        // Ausgabe des Ergebnis
        // System.out.println(ergebnis);

    }

    /**
     * methode1 Diese Methode addiert den ersten Eingabeparameter mit sich selbst
     * und reicht das Ergebnis als ersten Aufrufparameter an methode2 weiter. Der
     * zweite Eingabeparameter wird als zweiter Aufrufparameter an methode2
     * durchgereicht. Das Ergebnis der methode2 wird zurückgegeben.
     * 
     * @param wert1 Integer als erster Eingabeparameter
     * @param wert2 Integer als zweiter Eingabeparameter
     * @return Integer als Rückgabewert
     */

    // Hier die methode1 in Java schreiben ...

    /**
     * methode2 Diese Methode multipliziert den zweiten Eingabeparameter mit sich
     * selbst und reicht das Ergebnis als zweiten Aufrufparameter an methode3
     * weiter. Der erster Eingabeparameter wird als erster Aufrufparameter an
     * methode3 durchgereicht. Das Ergebnis der methode3 wird zurückgegeben.
     * 
     * @param wert1 Integer als erster Eingabeparameter
     * @param wert2 Integer als zweiter Eingabeparameter
     * @return Integer als Rückgabewert
     */

    // Hier die methode2 in Java schreiben ...

    /**
     * methode3 Diese Methode addiert beider Eingabeparameter und gibt das Ergebnis
     * zurück.
     * 
     * @param wert1 Integer als erster Eingabeparameter
     * @param wert2 Integer als zweiter Eingabeparameter
     * @return Integer als Rückgabewert
     */

    // Hier die methode3 in Java schreiben ...
}
