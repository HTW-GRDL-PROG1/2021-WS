class Datatypes {
    public static void main(String[] args) {
        System.out.println("Today we work with datatypes!");

        // Aufgabenpaket - Variablen & Datentypen
        System.out.println("Aufgabe 4");
        System.out.println(6 / 2);
        System.out.println(6 / 5);
        System.out.println(6 / 5.0);
        System.out.println(6.0 / 5.0);
        System.out.println(0.6 / 5);
        System.out.println(0 / 7);
        System.out.println(0 / 7.0);

        System.out.println("Aufgabe 7");
        try {
            System.out.println(89 % 0);
        } catch (Exception e) {
            System.out.println("Can't divide by zero: " + e);
        }
    }
}