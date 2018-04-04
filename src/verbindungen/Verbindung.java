package verbindungen;

import stadt.Stadt;

public class Verbindung {
    int distanz;
    Stadt nachbarStadt;

    public int getDistanz() {
        return distanz;
    }

    public void setDistanz(int distanz) {
        this.distanz = distanz;
    }

    public Stadt getNachbarStadt() {
        return nachbarStadt;
    }

    public void setNachbarStadt(Stadt nachbarStadt) {
        this.nachbarStadt = nachbarStadt;
    }
}
