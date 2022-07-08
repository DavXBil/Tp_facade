package facade;

import classes.*;

public class Facade {

    Lumieres lumieres = new Lumieres();

    Projecteur projecteur = new Projecteur();

    MachineAPopcorn machineAPopCorn = new MachineAPopcorn();

    Tuner tuner = new Tuner();

    LecteurDvd dvd = new LecteurDvd();

    LecteurCd cd = new LecteurCd();

    Amplificateur amp = new Amplificateur();
    Ecran ecran = new Ecran();

    String film = "Aliens";

    public void regarderFilm() {

        machineAPopCorn.marche();
        machineAPopCorn.eclater();
        lumieres.attenuer(10);
        ecran.baisser();
        projecteur.marche();
        projecteur.modeGrandEcran();
        amp.marche();
        amp.setLecteurDvd(dvd);
        amp.setSonSurround();
        amp.setVolume(5);
        dvd.marche();
        dvd.jouer(film);

    }

    public void arreterFilm() {

        dvd.stop();
        dvd.ejecter();
        dvd.arret();
        amp.arret();
        ecran.monter();
        projecteur.arret();
        projecteur.modeTV();
        machineAPopCorn.arret();

    }


    public void ecouterCd() {
        amp.marche();
        amp.setLecteurCd(cd);
        amp.setSonStereo();
        amp.setVolume(10);
        cd.marche();
        cd.jouer();

    }

    public void arreterCd() {
        cd.stop();
        cd.ejecter();
        cd.arret();
        amp.arret();

    }

    public void ecouterRadio() {
        amp.marche();
        amp.setTuner(tuner);
        tuner.marche();
        tuner.setFm();
        tuner.setFrequence(125.5);
        amp.setVolume(6);
    }

    public void arreterRadio() {

        tuner.arret();
        amp.arret();
    }

}
