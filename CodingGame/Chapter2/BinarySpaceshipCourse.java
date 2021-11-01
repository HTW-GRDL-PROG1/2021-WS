public class BinarySpaceshipCourse {

    /**
     * Aufgabe: Der Kurs deines Raumschiffs lautet 1101001101. Über Funk hast du
     * mitbekommen, dass sich in Lichtgeschwindigkeit ein Space Shuttle nähert, dass
     * dich bald einholen wird. Es hat den Kurs 1011100001. Damit ihr nicht
     * kollidiert, musst du deinen Kurs an den des Space Shuttles anpassen. Du
     * möchtest wissen, wie oft du insgesamt deinen Kurs wechseln musst, damit du
     * vorher genügend Treibstoff laden kannst.
     * 
     * Überlege dir einen Algorithmus, der zählt wie oft du deinen Kurs ändern
     * musst, damit du nicht mit dem Space Shuttle zusammenstößt.
     * 
     * Überlege dir auch was passieren würde, wenn zusätzlich zu dem Space Shuttle
     * gleichzeitig noch eine Rakete deinen Kurs kreuzen würde?
     */

    public static void main(String[] args) {

        String myCourse = "1101001101";
        String otherCourse = "1011100001";

        int numChanges = countChanges(myCourse, otherCourse);
        System.out.println("Number of changes: " + numChanges);
    }

    private static int countChanges(String c1, String c2) {

        int courseLength = c1.length();
        int changeCounter = 0;

        for (int i = 0; i < courseLength; i++) {

            if (c1.charAt(i) == c2.charAt(i)) {
                changeCounter += 1;
            }
        }
        return changeCounter;
    }

}
