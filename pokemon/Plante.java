package pokemon;

public class Plante extends Pokemon {

    public Plante(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    /*
     * enfin, les Pokémon de type Plante sont super efficaces contre
     * les Pokémon de type Eau et leur infligent deux fois
     * plus de dégâts (2atk). Par contre, ils sont très peu efficaces contre les
     * Pokémon de type Plante ou de type Feu et
     * ne leur infligent que la moitié des dégâts (0.5atk). Ils infligent
     * des dégâts normaux aux Pokémon de type Normal.
     */

    public void attaquer(Pokemon p) throws Exception {
        if (p.isDead()) {
            throw new Exception("Le Pokemon est mort");
        }
        int combat = p.getHp();

        if (p instanceof Plante) {
            combat -= this.getAtk() * 2;
        } else if (p instanceof Plante || p instanceof Feu) {
            combat -= this.getAtk() * 0.5;
        } else {
            combat -= this.getAtk();
        }
        p.setHp(combat);
    }

}
