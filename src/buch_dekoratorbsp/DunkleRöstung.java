package buch_dekoratorbsp;

public class DunkleRöstung extends Getränk {
    public DunkleRöstung(){
        beschreibung = "Dunkle Röstung";
    }

    @Override
    public double preis() {
        return 0.99;
    }
}
