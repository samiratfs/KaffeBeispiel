package buch_dekoratorbsp;

public class Soja extends Zutatdekorierer{
    Getränk getränk;
    public Soja(Getränk getränk){
        this.getränk = getränk;
    }

    public String getBeschreibung(){
        return getränk.getBeschreibung()+"Soja<3";
    }

    public double preis(){
        return 0.15+getränk.preis();
    }
}
