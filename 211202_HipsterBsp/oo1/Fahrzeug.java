package oo1;

public class Fahrzeug {
    // marke, motorisierung, farbe, getriebe, ps
    private String marke;
    private String motorisierung;
    private String farbe;
    private String getriebe;
    private int ps;
    private static int anzahlFahrzeuge;

    Fahrzeug() {
        Fahrzeug.anzahlFahrzeuge ++;
    }

    Fahrzeug(String marke, String motorisierung, String farbe, int ps) {
        this.marke = marke;
        this.motorisierung = motorisierung;
        this.farbe = farbe;
        this.ps = ps;
    }

    public String getMarke() {
        return this.marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getFarbe() {
        return this.farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
}
