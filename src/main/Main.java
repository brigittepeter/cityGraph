package main;

import stadt.Stadt;
import verbindungen.Verbindung;

public class Main {

    public static void main (String args[]){

        Stadt frankfurt = new Stadt();
        frankfurt.setNameStadt("Frankfurt");
        frankfurt.setEinwohnerZahl(736414);
        frankfurt.setFlaeche(248.31);

        Stadt nuernberg = new Stadt();
        nuernberg.setNameStadt("Nuernberg");
        nuernberg.setEinwohnerZahl(526920);
        nuernberg.setFlaeche(186.5);

        Stadt muenchen = new Stadt();
        muenchen.setNameStadt("Muenchen");
        muenchen.setEinwohnerZahl(1545105);
        muenchen.setFlaeche(310.71);

        Stadt augsburg = new Stadt();
        augsburg.setNameStadt("Augsburg");
        augsburg.setEinwohnerZahl(290743);
        augsburg.setFlaeche(146.8);

        Stadt ulm = new Stadt();
        ulm.setNameStadt("Ulm");
        ulm.setEinwohnerZahl(124781);
        ulm.setFlaeche(118.7);

        Stadt stuttgart = new Stadt();
        stuttgart.setNameStadt("Stuttgart");
        stuttgart.setEinwohnerZahl(611213);
        stuttgart.setFlaeche(207.4);

        // Nachbarn von Frankfurt
        Verbindung con1 = new Verbindung();
        con1.setNachbarStadt(nuernberg);
        con1.setDistanz(100);
        frankfurt.getVerbindungen().add(con1);

        Verbindung con2 = new Verbindung();
        con2.setNachbarStadt(ulm);
        con2.setDistanz(120);
        frankfurt.getVerbindungen().add(con2);

        Verbindung con3 = new Verbindung();
        con3.setNachbarStadt(stuttgart);
        con3.setDistanz(50);
        frankfurt.getVerbindungen().add(con3);

        // Nachbarn von Stuttgart
        Verbindung con4 = new Verbindung();
        con4.setNachbarStadt(frankfurt);
        con4.setDistanz(50);
        stuttgart.getVerbindungen().add(con4);

        Verbindung con5 = new Verbindung();
        con5.setNachbarStadt(ulm);
        con5.setDistanz(100);
        stuttgart.getVerbindungen().add(con5);

        // Nachbarn von Ulm
        Verbindung con6 = new Verbindung();
        con6.setNachbarStadt(stuttgart);
        con6.setDistanz(100);
        ulm.getVerbindungen().add(con6);

        Verbindung con7 = new Verbindung();
        con7.setNachbarStadt(frankfurt);
        con7.setDistanz(120);
        ulm.getVerbindungen().add(con7);

        Verbindung con8 = new Verbindung();
        con8.setNachbarStadt(nuernberg);
        con8.setDistanz(70);
        ulm.getVerbindungen().add(con8);

        Verbindung con9 = new Verbindung();
        con9.setNachbarStadt(augsburg);
        con9.setDistanz(80);
        ulm.getVerbindungen().add(con9);

        //Nachbarn von Nürnberg
        Verbindung con10 = new Verbindung();
        con10.setNachbarStadt(frankfurt);
        con10.setDistanz(100);
        nuernberg.getVerbindungen().add(con10);

        Verbindung con11 = new Verbindung();
        con11.setNachbarStadt(ulm);
        con11.setDistanz(70);
        nuernberg.getVerbindungen().add(con11);

        Verbindung con12 = new Verbindung();
        con12.setNachbarStadt(augsburg);
        con12.setDistanz(80);
        nuernberg.getVerbindungen().add(con12);

        Verbindung con13 = new Verbindung();
        con13.setNachbarStadt(muenchen);
        con13.setDistanz(150);
        nuernberg.getVerbindungen().add(con13);

        // Nachbarn von Augsburg
        Verbindung con14 = new Verbindung();
        con14.setNachbarStadt(ulm);
        con14.setDistanz(80);
        augsburg.getVerbindungen().add(con14);

        Verbindung con15 = new Verbindung();
        con15.setNachbarStadt(nuernberg);
        con15.setDistanz(80);
        augsburg.getVerbindungen().add(con15);

        Verbindung con16 = new Verbindung();
        con16.setNachbarStadt(muenchen);
        con16.setDistanz(50);
        augsburg.getVerbindungen().add(con16);

        //Nachbarn von München
        Verbindung con17 = new Verbindung();
        con17.setNachbarStadt(augsburg);
        con17.setDistanz(50);
        muenchen.getVerbindungen().add(con17);

        Verbindung con18 = new Verbindung();
        con18.setNachbarStadt(nuernberg);
        con18.setDistanz(150);
        augsburg.getVerbindungen().add(con18);

    }
}


