package buch_dekoratorbsp;

public class Milchschaum extends Zutatdekorierer{
    Getränk getränk;
    public Milchschaum(Getränk getränk){
        this.getränk = getränk;
    }

    @Override
    public String getBeschreibung() {
        return getränk.getBeschreibung()+"Milchschaum<3";
    }

    @Override
    public double preis() {
        return 0.10+getränk.preis();
    }
}
