package vehicule;

public class Main {
    public static void main(String[] args) {
        Voiture renault = new Voiture("Renault", 2015, 10000, 10, 4, 200, 2000);

        renault.affiche();
        renault.calculePrix(2018);
        renault.affiche();

    }
}
