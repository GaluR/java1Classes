package pojazdy;

public class Gąsiennicowe extends Pojazd {
    private int moc;

    public Gąsiennicowe(int rokProdukcji, String rodzajSilnika, String kolor, double masa, int moc) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
        this.moc = moc;
    }

    public Gąsiennicowe() {
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    @Override
    public final void uruchomSilnik() {
        super.uruchomSilnik();
        System.out.println("Jest to pojazd gąsiennicowy");
    }
}
