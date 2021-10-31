public class Abgabe02 {
    public static void main(String[] args) {

        double preis;

        int vier = 4;

        boolean b = false, weiter = true;

        System.out.println(b || !(b && weiter));
        preis = (vier + 3) / 2.0;
        System.out.println(preis);
        System.out.println(!(b == false));
        //System.out.println(b == true = false);
        System.out.println((preis = 4.9f) != vier);
        System.out.println((vier + 3) / 2);
        System.out.println(vier / 0.4);
        System.out.println(b = false != weiter);

    }
}
