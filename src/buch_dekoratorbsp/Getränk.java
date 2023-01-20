package buch_dekoratorbsp;

public abstract class Getränk {
    String beschreibung = "Unbekanntes Getränk";

    public String getBeschreibung(){
        return beschreibung;
    }
    public abstract double preis();
}
