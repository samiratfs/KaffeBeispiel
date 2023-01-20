package buch_dekoratorbsp;

public class Schoko extends Zutatdekorierer {
    Getränk getränk;
    public Schoko(Getränk getränk){
        this.getränk = getränk;
    }

    public String getBeschreibung(){
        return getränk.getBeschreibung()+"Schoko";
    }

    public double preis(){
        return 0.20+getränk.preis();
    }

}
