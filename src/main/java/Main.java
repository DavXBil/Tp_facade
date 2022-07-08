import facade.Facade;

public class Main {

    public static void main(String[] args) {
        Facade homeCinema = new Facade();

        homeCinema.regarderFilm();
        System.out.println("-------------------------------");
        homeCinema.arreterFilm();
        System.out.println("-------------------------------");
        homeCinema.ecouterCd();
        System.out.println("-------------------------------");
        homeCinema.arreterCd();
        System.out.println("-------------------------------");
        homeCinema.ecouterRadio();
        System.out.println("-------------------------------");
        homeCinema.arreterRadio();
    }
}
