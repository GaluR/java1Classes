package pojazdy;

public class Osobowy extends Kołowe {
    private int iloscOsob;

    public Osobowy(int rokProdukcji, String rodzajSilnika, String kolor, double masa, String rozmiarOpony, int iloscOsob) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony);
        this.iloscOsob = iloscOsob;
    }

    public Osobowy() {
    }

    public int getIloscOsob() {
        return iloscOsob;
    }

    public void setIloscOsob(int iloscOsob) {
        this.iloscOsob = iloscOsob;
    }

    Osobowy osobowy1 = new Osobowy(2019, "elektryczny", "biały", 1200, "195/70 R15", 4);
    Osobowy osobowy2 = new Osobowy(2012, "benzynowy", "czerwony", 1500, "185/70 R16", 5);
    Osobowy osobowy3 = new Osobowy(2009, "diesel", "niebieski", 1800, "195/80 R17", 5);
}
