package verbindungen;

import stadt.Stadt;

public class Verbindungen {
    int distanz;
    Stadt nachbarSdtadt;

    public int getDistanz() {
        return distanz;
    }

    public void setDistanz(int distanz) {
        this.distanz = distanz;
    }

    public Stadt getNachbarSdtadt() {
        return nachbarSdtadt;
    }

    public void setNachbarSdtadt(Stadt nachbarSdtadt) {
        this.nachbarSdtadt = nachbarSdtadt;
    }
}
