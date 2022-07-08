package classes;

public class Amplificateur {

    private Tuner tuner;

    private LecteurCd lecteurCd;

    private LecteurDvd lecteurDvd;

    private boolean sonStereo;
    private boolean sonSurround;

    private int volume;

    public Amplificateur() {
        this.volume = 10;
        this.sonStereo = true;
        this.sonSurround = true;
    }

    public Amplificateur(Tuner tuner, LecteurCd lecteurCd, LecteurDvd lecteurDvd) {
        this.tuner = tuner;
        this.lecteurCd = lecteurCd;
        this.lecteurDvd = lecteurDvd;
        this.volume = 10;
    }

    public void marche() {
        System.out.println("Amplificateur ON");
    }

    public void arret() {
        System.out.println("Amplificateur OFF");

    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setLecteurCd(LecteurCd lecteurCd) {
        this.lecteurCd = lecteurCd;
    }

    public void setLecteurDvd(LecteurDvd lecteurDvd) {
        this.lecteurDvd = lecteurDvd;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setSonStereo() {
        if (sonSurround) {
            sonSurround = false;
        }
        sonStereo = true;
    }
    public void setSonSurround() {
        if (sonStereo) {
            sonStereo = false;
        }
        sonSurround = true;
    }
}
