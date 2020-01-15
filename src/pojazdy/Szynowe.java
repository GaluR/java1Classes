package pojazdy;

import pojazdy.Pojazd;

public class Szynowe extends Pojazd {
    public Szynowe(int rokProdukcji, String rodzajSilnika, String kolor, double masa) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
    }

    public Szynowe() {
    }

    public void uruchomSilnik() {
        System.out.println("uruchomiono silnik pojazdu szynowego");
    }
}
