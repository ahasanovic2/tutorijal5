package ba.unsa.etf.rpr.tutorijal5;

import java.util.ArrayList;

public class Semestar {
    private ArrayList<Predmet> predmeti;
    private int ukupanBrojECTS;

    public ArrayList<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(ArrayList<Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    public int getUkupanBrojECTS() {
        return ukupanBrojECTS;
    }

    public void setUkupanBrojECTS(int ukupanBrojECTS) {
        this.ukupanBrojECTS = ukupanBrojECTS;
    }

    public Semestar(ArrayList<Predmet> predmeti, int ukupanBrojECTS) {
        this.predmeti = predmeti;
        this.ukupanBrojECTS = ukupanBrojECTS;
    }

}
