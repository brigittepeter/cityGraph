package stadt;

import verbindungen.Verbindung;

import java.util.List;

public class Stadt {
    private String nameStadt;
    private int einwohnerZahl;
    private double flaeche;
    private List<Verbindung> verbindungen;

    public String getNameStadt() {
        return nameStadt;
    }

    public void setNameStadt(String nameStadt) {
        this.nameStadt = nameStadt;
    }

    public int getEinwohnerZahl() {
        return einwohnerZahl;
    }

    public void setEinwohnerZahl(int einwohnerZahl) {
        this.einwohnerZahl = einwohnerZahl;
    }

    public double getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(double flaeche) {
        this.flaeche = flaeche;
    }

    public List<Verbindung> getVerbindungen() {
        return verbindungen;
    }

    public void setVerbindungen(List<Verbindung> verbindungen) {
        this.verbindungen = verbindungen;
    }
}



