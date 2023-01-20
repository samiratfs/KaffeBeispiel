package buch_dekoratorbsp;

public class Entkoffeiniert extends Getränk {
    public Entkoffeiniert(){
        beschreibung = "Ohne Koffein";
    }

    @Override
    public double preis() {
        return 1.05;
    }
}
