package pojazdy;

public class Pociąg extends Szynowe {

    static String wlasciciel;

    static {
        wlasciciel = "P.K.P.";
    }

    public Pociąg(int rokProdukcji, String rodzajSilnika, String kolor, double masa) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
    }

    public Pociąg() {
    }

}
