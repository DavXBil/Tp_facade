package classes;

public class Projecteur {

    private LecteurDvd lecteurDvd;

    public Projecteur() {

    }

    public void marche() {
        System.out.println("projecteur allumé");
    }

    public void arret() {
        System.out.println("projecteur éteint");

    }

    public void modeTV() {
        System.out.println("projecteur mode TV");
    }

    public void modeGrandEcran() {
        System.out.println("projecteur mode grand écran");
    }

}
