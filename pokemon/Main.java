package pokemon;

public class Main {
    public static void main(String[] args) {
        Eau pokemonEau = new Eau("pokemonEau", 100, 30);
        Feu pokemonFeu = new Feu("pokemonFeu", 40, 40);
        Plante pokemonPlante = new Plante("pokemonPlante", 80, 120);

        System.out.println(pokemonFeu);

        try {
            pokemonPlante.attaquer(pokemonFeu);
            pokemonPlante.attaquer(pokemonFeu);

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

        System.out.println(pokemonFeu);
    }
}
