package stadt;

import verbindungen.Verbindungen;

import java.util.List;

public class Stadt {
    String nameStadt;
    int einwohnerZahl;
    double flaeche;
    List<Verbindungen> verbindungen;

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

    public List<Verbindungen> getVerbindungen() {
        return verbindungen;
    }

    public void setVerbindungen(List<Verbindungen> verbindungen) {
        this.verbindungen = verbindungen;
    }
}



