public class Increment {

    public static void main(String[] args) {

        /**
         * Wir kennen 'i++' aus for-Schleifen. Dabei wird der Wert von i in jedem
         * Durchlauf um 1 erhöht.
         * 
         */
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        /**
         * Was aber ist der Unterschied zu ++i?
         * Wenn wir i in einer Zuweisung nutzen, dann können wir unterschiedliches
         * Verhalten zwischn i++ und ++i feststellen.
         * 
         * a = 1 + i++; ist also etwas anderes als a = 1 + ++i;
         */

        // Wir berechnen a = 3 + 0, dann erst i = 0 + 1
        int i = 0;
        int a = 3 + i++;
        System.out.println("i= " + i + "; a = " + a);

        // Wir berechnen i = 0 + 1, dann erst b = 3 + 1
        i = 0;
        int b = 3 + ++i;
        System.out.println("i= " + i + "; b = " + b);
    }
}
