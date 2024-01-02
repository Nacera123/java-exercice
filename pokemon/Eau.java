package pokemon;

public class Eau extends Pokemon {

    public Eau(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    public void attaquer(Pokemon p) throws Exception {
        if (p.isDead()) {
            throw new Exception("Le Pokemon est mort");
        }
        int combat = p.getHp();
        if (p instanceof Feu) {
            combat -= this.getAtk() * 2;
        } else if (p instanceof Eau || p instanceof Plante) {
            combat -= this.getAtk() * 0.5;
        } else {
            combat -= this.getAtk();
        }

        p.setHp(combat);
    }

}
