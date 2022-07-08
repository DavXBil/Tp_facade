package classes;

public class LecteurDvd {


    public LecteurDvd() {
    }

    public void marche() {
        System.out.println("Lecteur Dvd ON");
    }

    public void arret() {
        System.out.println("Lecteur Dvd OFF");
    }

    public void ejecter() {

    }

    public void pause() {

    }
    public void stop() {
        System.out.println("Lecteur Dvd Stop");
    }

    public void jouer(String film) {
        System.out.println("Tu regardes " + film);
    }

}
