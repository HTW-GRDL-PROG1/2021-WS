public class Superhero {

    // Attribute/Eigenschaften der Klasse (Variablen)
    String firstName;
    String lastName;
    int yearOfBirth;

    // Quasi das "Konto" des Helden. Nur der Held selbst kann sein Konto einsehen.
    private int herocoins = 0;

    // Der Superheld hat standardmäßig keinen Gefährten, daher ist der Wert 'null'
    String companion = null;

    // Konstruktor, der Instanzen/einzelne Superheros erzeugt; heißt immer wie die
    // Klasse. Legt sozusagen die Minimalanforderungen fest, was einen Superhero
    // ausmacht.
    public Superhero(String firstName, String lastName, int yearOfBirth) {
        // keyword 'this' beschreibt, dass wir uns auf die Eigenschaften des Helden
        // beziehen
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * Getter und Setter Methoden
     * 
     * Getter: holt einen Wert einer Eigenschaft/eines Attributs
     * Setter: setzt einen Wert einer Eigenschaft/eines Attributs
     */
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    /**
     * Gibt den Namen des Gefährten unseres Superhelden zurück
     * 
     * @return der Name als String
     */
    public String getCompanion() {
        return this.companion;
    }

    public void setCompanion(String companion) {
        this.companion = companion;
    }

    public int getHerocoins() {
        return this.herocoins;
    }

    public void addHerocoins(int amount) {
        // gleiches wie: this.herocoins = this.herocoins + amount;
        this.herocoins += amount;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}