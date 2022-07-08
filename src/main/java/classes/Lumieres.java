package classes;

public class Lumieres {

    private int intensite = 20;

    public Lumieres() {
    }

    public void marche() {
        System.out.println("Lumières ON");
    }

    public void arret() {
        System.out.println("Lumières OFF");
    }

    public void attenuer(int intensite) {
        this.intensite = intensite;
    }

}
