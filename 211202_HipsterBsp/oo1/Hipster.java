package oo1;

// vor der class steht weder public noch private, sie nur im selben Package sichtbar
class Hipster {
    // Objektattribute sind in der Regel private. D.h. sie sind nur
    // in der selben Klasse sichtbar. Um in einer anderen Klasse auf diese
    // zugreifen zu können benutzen wir die getter und setter-Methoden 
    private String name;
    private int age;
    private String gender;
    private String hairStyle;
    // Das `static` Keyword bedeutet dass es sich um ein Klassen-Attribut und nicht
    // um ein Objekt-Attribut handelt. Während alle Instanzen (Objekte) der Klasse
    // Hipster eigene `name`, `age`, `gender`, `hairStyle` und `fahrzeug` haben,
    // gibt es `anzahlHipster nur einmal und alle Obejkte teilen sich dieses Attribut
    private static int anzahlHipster=0;
    // Man kann auch Objektattribute aus selbt-definierten Klassen deklarieren.
    // Da sich `Hipster` und `Fahrzeug` im selben Packet befinden, brauchen wir
    // keine extra Imports, sondern die Klassen kennen sich auch so gegenseitig
    private Fahrzeug fahrzeug;

    // Ein Konstruktor. Konstruktoren werden benutzt um neue Objekte aus der
    // Klasse zu erzeugen. Sie haben immer den selben Namen wie die Klasse
    // und () danach, was andeutet, dass es sich um eine Art Methode handelt
    // Dieser konkrete Konstruktor erzeugt ein neues Objekt der Klasse Hipster,
    // belegt aber soweit dessen Attribute nicht. D.h. `name`, `gender` etc.
    // sind alles null
    public Hipster() {
        anzahlHipster++;
    }

    // Ein anderer Konstruktor. Man kann mehrere Konstruktoren haben, solange diese
    // verschiedene Signaturen haben (in der Regel unterscheiden sie sich um die
    // Parameter, die sie nehmen. Hier werden z.B. `name`, `age` und `gender` übergeben
    // und direkt gesetzt)
    public Hipster(String name, int age, String gender) {
        // Das `this` Keyword bezieht sich auf das neu erstellte Objekt der Klasse
        // also ist `this.name` der `name` vom Objekt, den wir in z.8 deklariert haben
        // während `name` (rechts vom Gleichheitszeichen) der `name`-Parameter ist,
        // den wir in z.33 dem Konstruktor übergeben. VSCode highlighted die entsprechenden
        // Paare wenn man mit der Maus auf eins davon klickt.
        this.name = name;
        this.age = age;
        this.gender = gender;
        anzahlHipster++;
    }

    // Eine get-Methode für das Attribut `name`. Da diese public ist und `name`
    // private, können wir die Methode benutzen um außerhalb der Hipster-Klasse
    // den `name` auszulesen (z.B. in App.java). Get-Methoden returnen immer das
    // entsprechende Attribut
    public String getName() {
        return this.name;
    }

    // Eine set-Methode für das Attribut `name`. Diese können wir außerhalb
    // der Hipster-Klasse benutzen um `name` einen neuen Wert zuzuweisen.
    // set-Methoden ermöglichen immer die (Neu-)Belegung des jeweiligen Attributs
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // eine get-Methode für das Attribut `anzahlHipster`. Achtung!: Diese
    // muss `static` sein, da `anzahlHipster` selber `static` ist
    public static int getAnzahlHipster() {
        return anzahlHipster;
    }

    // eine set-Methode für das Attribut `anzahlHipster`. Same mit `static`
    public static void setAnzahlHipster(int anzahl) {
        anzahlHipster = anzahl;
    }

    public Fahrzeug getFahrzeug() {
        return this.fahrzeug;
    }

    public void setFahrzeug(Fahrzeug fahrzeug) {
        this.fahrzeug = fahrzeug;
    }
    
    public void bemaltFahrzeug() {
        this.fahrzeug.setFarbe("grün");
    }
   
    public void printHipster() {
        System.out.println("Hipster " + this.name + ":");
        System.out.println("Alter: " + this.age + ", Gender: " + this.gender);
    }
}
