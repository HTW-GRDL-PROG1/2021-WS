package abgabeXY;

import java.util.*;

public class AbgabeXY {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Frage 1: (15 / 2) ?");
        System.out.print("Antwort: ");
        String res1 = in.nextLine();
        int sol1 = (15 / 2);
        checkAnswer(Integer.parseInt(res1), sol1);

        System.out.println("Frage 2: (3 / 2) / 2.0 ?");
        System.out.print("Antwort: ");
        String res2 = in.nextLine();
        double sol2 = (3 / 2) / 2.0;
        checkAnswer(Double.parseDouble(res2), sol2);

        System.out.println("Frage 3: (15 % 7) * 2 ?");
        System.out.print("Antwort: ");
        String res3 = in.nextLine();
        int sol3 = (15 % 7) * 2;
        checkAnswer(Integer.parseInt(res3), sol3);

        System.out.println("Variablen für Aufgabe 4:\n");
        System.out.println("double preis");
        System.out.println("int vier = 4");
        System.out.println("boolean b = false, weiter = true;\n");
        double preis;
        int vier = 4;
        boolean b = false, weiter = true;

        System.out.println("Frage 4a: b || !(b && weiter) ?");
        System.out.print("Antwort: ");
        String res4a = in.nextLine();
        boolean sol4a = b || !(b && weiter);
        checkAnswer(Boolean.parseBoolean(res4a), sol4a);

        System.out.println("Frage 4b: preis = (vier + 3) / 2.0 ?");
        System.out.print("Antwort: ");
        String res4b = in.nextLine();
        double sol4b = preis = (vier + 3) / 2.0;
        checkAnswer(Double.parseDouble(res4b), sol4b);

        System.out.println("Frage 4c: !(b == false) ?");
        System.out.print("Antwort: ");
        String res4c = in.nextLine();
        boolean sol4c = !(b == false);
        checkAnswer(Boolean.parseBoolean(res4c), sol4c);

        System.out.println("Frage 4d: b == true = false ?");
        System.out.print("Antwort: ");
        String res4d = in.nextLine();
        String sol4d = "Error";
        checkAnswer(res4d, sol4d);

        System.out.println("Frage 4e: (preis = 4.9f) != vier ?");
        System.out.print("Antwort: ");
        String res4e = in.nextLine();
        boolean sol4e = (preis = 4.9f) != vier;
        checkAnswer(Boolean.parseBoolean(res4e), sol4e);

        System.out.println("Frage 4f: (vier + 3) / 2 ?");
        System.out.print("Antwort: ");
        String res4f = in.nextLine();
        int sol4f = (vier + 3) / 2;
        checkAnswer(Integer.parseInt(res4f), sol4f);

        System.out.println("Frage 4g: vier / 0.4 ?");
        System.out.print("Antwort: ");
        String res4g = in.nextLine();
        double sol4g = vier / 0.4;
        checkAnswer(Double.parseDouble(res4g), sol4g);

        System.out.println("Frage 4h: b = false != weiter ?");
        System.out.print("Antwort: ");
        String res4h = in.nextLine();
        boolean sol4h = b = false != weiter;
        checkAnswer(Boolean.parseBoolean(res4h), sol4h);

        System.out.println("Frage 5: 3 als Binärzahl ?");
        System.out.print("Antwort: ");
        String res5 = in.nextLine();
        String tmp = Integer.toBinaryString(3);
        String sol5 = ("00000000" + tmp).substring(tmp.length());
        checkAnswer(res5, sol5);

        System.out.println("Aufgabe 6: Ergänze den korrekten Datentyp\n");
        System.out.println("@?");
        String res6a = in.nextLine();
        checkAnswer(res6a, "char");

        System.out.println("Telefonnummer?");
        String res6b = in.nextLine();
        checkAnswer(res6b, "String");

        System.out.println("Reelle Zahl?");
        String res6c = in.nextLine();
        checkAnswer(res6c, "Double");

        System.out.println("Stückzahl?");
        String res6d = in.nextLine();
        checkAnswer(res6d, "int");

        System.out.println("Zustand eines Lichtschalters (ein/aus)?");
        String res6e = in.nextLine();
        checkAnswer(res6e, "boolean");

        System.out.println("Gewicht?");
        String res6f = in.nextLine();
        checkAnswer(res6f, "Double");

        System.out.println("Zeichen 9?");
        String res6g = in.nextLine();
        checkAnswer(res6g, "char");

    }

    private static void checkAnswer(int answer, int solution) {
        if (answer == solution) {
            System.out.println("Richtig!");
        } else {
            System.out.println("Falsch! Die richtige Antwort ist " + solution);
        }
        System.out.println("=======================================");
    }

    private static void checkAnswer(double answer, double solution) {
        if (answer == solution) {
            System.out.println("Richtig!");
        } else {
            System.out.println("Falsch! Die richtige Antwort ist " + solution);
        }
        System.out.println("=======================================");
    }

    private static void checkAnswer(boolean answer, boolean solution) {
        if (answer == solution) {
            System.out.println("Richtig!");
        } else {
            System.out.println("Falsch! Die richtige Antwort ist " + solution);
        }
        System.out.println("=======================================");
    }

    private static void checkAnswer(String answer, String solution) {
        if (answer.equals(solution)) {
            System.out.println("Richtig!");
        } else {
            System.out.println("Falsch! Die richtige Antwort ist " + solution);
        }
        System.out.println("=======================================");
    }
}
