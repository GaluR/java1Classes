package pojazdy;

public class Czołg extends Gąsiennicowe {
    public Czołg(int rokProdukcji, String rodzajSilnika, String kolor, double masa, int moc) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, moc);
    }

    public Czołg() {
    }
   // pkt 11  gdy do metody w gąsiennicowe damy final nie mozemy nadpisac metody w klasie czołg.
}
