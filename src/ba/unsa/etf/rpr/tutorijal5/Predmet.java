package ba.unsa.etf.rpr.tutorijal5;

public class Predmet {
    private String imePredmeta;
    private int brojECTS;
    private int brojUpisanihStudenata;

    public String getImePredmeta() {
        return imePredmeta;
    }

    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public int getBrojECTS() {
        return brojECTS;
    }

    public void setBrojECTS(int brojECTS) {
        this.brojECTS = brojECTS;
    }

    public int getBrojUpisanihStudenata() {
        return brojUpisanihStudenata;
    }

    public void setBrojUpisanihStudenata(int brojUpisanihStudenata) {
        this.brojUpisanihStudenata = brojUpisanihStudenata;
    }

    public Predmet(String imePredmeta, int brojECTS, int brojUpisanihStudenata) {
        this.imePredmeta = imePredmeta;
        this.brojECTS = brojECTS;
        this.brojUpisanihStudenata = brojUpisanihStudenata;
    }
}
