package buch_dekoratorbsp;

public class SternbackKaffee {
    public static void main(String[] args) {
        Getränk getränk = new Espresso();
        System.out.println(getränk.getBeschreibung()+ " " + getränk.preis()+ "€");
        Getränk getränk2 = new DunkleRöstung();
        getränk2 = new Schoko(getränk2);
        getränk2 = new Milchschaum(getränk2);
        System.out.println(getränk2.getBeschreibung() + " " + getränk2.preis() * "€");
        Getränk getränk3 = new Hausmischung();
        getränk3 = new Soja(getränk3);
        getränk3 = new Schoko(getränk3);
        getränk3 = new Milchschaum(getränk3);
        System.out.println(getränk3.getBeschreibung()+ " " + getränk3.preis()+ "€");
    }
}
