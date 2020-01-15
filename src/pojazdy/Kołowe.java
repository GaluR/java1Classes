package pojazdy;

public class Kołowe extends Pojazd {
    private String rozmiarOpony;

    public Kołowe(int rokProdukcji, String rodzajSilnika, String kolor, double masa, String rozmiarOpony) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
        this.rozmiarOpony = rozmiarOpony;
    }

    public Kołowe() {
    }

    public String getRozmiarOpony() {
        return rozmiarOpony;
    }

    public void setRozmiarOpony(String rozmiarOpony) {
        this.rozmiarOpony = rozmiarOpony;
    }

    public void uruchomSilnik(String rodzajSilnika) {
        System.out.println("uruchomiono silnik " + rodzajSilnika);
    }

}
