package pokemon;

public class Feu extends Pokemon {

    public Feu(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    public void attaquer(Pokemon p) throws Exception {
        if (p.isDead()) {
            throw new Exception("Le Pokemon est mort");
        }

        int combat = p.getHp();

        if (p instanceof Plante) {
            combat -= 2 * this.getAtk();
        } else if (p instanceof Eau || p instanceof Feu) {
            combat -= 0.5 * this.getAtk();
        } else {
            combat -= this.getAtk();
        }
        if (combat <= 0) {
            combat = 0;
        }
        p.setHp(combat);

    }

    // int combat = p.getHp();
    // if (p instanceof Plante) {
    // combat -= 2 * this.getAtk();
    // } else if (p instanceof Eau || p instanceof Feu) {
    // combat -= 0.5 * this.getAtk();
    // } else {
    // combat -= this.getAtk();
    // }
    // p.setHp(combat);

}
