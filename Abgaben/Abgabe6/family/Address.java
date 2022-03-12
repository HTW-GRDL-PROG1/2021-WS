package family;

public class Address {
    String strasse;
    int hausnummer;
    int plz;
    String wohnort;
    String land;

    public Address(String strasse, int hausnummer, int plz, String wohnort, String land) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.wohnort = wohnort;
        this.land = land;
    }
}
