package pojazdy;

public class Pojazd { // pkt 12 kiedy dodamy private przed nazwą klasy dostajemy informacje ze operacja jest niedozwolona, podobnie punkt 13 kiedy jest protected
    private int rokProdukcji;
    private String rodzajSilnika;
    private String kolor;
    private double masa;

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String getRodzajSilnika() {
        return rodzajSilnika;
    }

    public void setRodzajSilnika(String rodzajSilnika) {
        this.rodzajSilnika = rodzajSilnika;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public Pojazd(int rokProdukcji, String rodzajSilnika, String kolor, double masa) {
        this.rokProdukcji = rokProdukcji;
        this.rodzajSilnika = rodzajSilnika;
        this.kolor = kolor;
        this.masa = masa;
    }

    public Pojazd() {
    }

    public void uruchomSilnik(){
        System.out.println("Silnik uruchomiono");
    }

}
