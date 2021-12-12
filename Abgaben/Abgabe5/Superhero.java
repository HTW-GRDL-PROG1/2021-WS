public class Superhero {

    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String companion = null;
    private int herocoins = 0;

    public Superhero(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public void addHerocoins(int amount) {
        this.herocoins += amount;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getCompanion() {
        return this.companion;
    }

    public void setCompanion(String companion) {
        this.companion = companion;
    }

    public int getHerocoins() {
        return this.herocoins;
    }

    public void setHerocoins(int herocoins) {
        this.herocoins = herocoins;
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "{" +
                " firstName='" + getFirstName() + "'" +
                ", lastName='" + getLastName() + "'" +
                ", yearOfBirth='" + getYearOfBirth() + "'" +
                ", companion='" + getCompanion() + "'" +
                ", herocoins='" + getHerocoins() + "'" +
                "}";
    }

}