package pojazdy;

public class Ciężarówka extends Kołowe {
    private double udzwig;

    public Ciężarówka(int rokProdukcji, String rodzajSilnika, String kolor, double masa, String rozmiarOpony, double udzwig) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony);
        this.udzwig = udzwig;
    }

    public Ciężarówka() {
    }

    public double getUdzwig() {
        return udzwig;
    }

    public void setUdzwig(double udzwig) {
        this.udzwig = udzwig;
    }

    public void podniesSkrzynie(){}
}
