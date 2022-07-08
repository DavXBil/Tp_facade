package classes;

public class Tuner {

   private boolean am;
   private boolean fm;

   private double frequence;

    public Tuner() {

    }

    public void marche() {
        System.out.println("Radio ON");
    }

    public void arret() {
        System.out.println("Radio OFF");
    }

    public void setAm() {
        if (fm) {
            fm = false;
        }
        am = true;
    }

    public void setFm() {
        if (am) {
            am = false;
        }
        fm = true;
    }

    public void setFrequence(double frequence) {
        this.frequence = frequence;
    }

}
