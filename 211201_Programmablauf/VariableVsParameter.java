public class VariableVsParameter {

    public static void main(String[] args) {
        int x = 3; // Variable
        int y = 7; // Variable

        int ergebnis = addiere(x, y); // Variable

        System.out.println(x + " + " + y + " = " + ergebnis);

    }

    /**
     * Addiere zwei Zahlen
     * 
     * @param a integer, der erste Summand
     * @param b integer, der zweite Summand
     * @return Die Summe aus a und b
     */
    public static int addiere(int a, int b) { // Parameter
        int summe = a + b; // Variable
        return summe;
    }

}

class Student {

}