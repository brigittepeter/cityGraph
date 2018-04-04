package verbindungen;

import stadt.Stadt;

public class Verbindungen {
    int distanz;
    Stadt nachbarStadt;

    public int getDistanz() {
        return distanz;
    }

    public void setDistanz(int distanz) {
        this.distanz = distanz;
    }

    public Stadt getNachbarSdtadt() {
        return nachbarStadt;
    }

    public void setNachbarSdtadt(Stadt nachbarSdtadt) {
        this.nachbarStadt = nachbarSdtadt;
    }
}
