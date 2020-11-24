package ba.unsa.etf.rpr.tutorijal5;

public class Student {
    private String imeStudenta;
    private int brojIndeksa;

    public Student(String imeStudenta, int brojIndeksa) {
        this.imeStudenta = imeStudenta;
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeStudenta() {
        return imeStudenta;
    }

    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }
}
