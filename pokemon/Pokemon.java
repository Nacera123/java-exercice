package pokemon;

public class Pokemon {
    private String nom;
    private int hp;
    private int atk;

    /* Constructeur */
    public Pokemon(String nom, int hp, int atk) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
    }
    /*
     * Methode is Dead
     * 
     * @return true si pokemon est vivant
     */

    public boolean isDead() {

        // boolean dead = false;
        // if (hp <= 0) {
        // dead = true;
        // }
        /* Pour resumer */
        return this.hp <= 0;
    }

    /* Methode attaquer */
    public void attaquer(Pokemon p) throws Exception {
        if (p.isDead()) {
            throw new Exception(p.getNom() + " Il est deja mort");
        }
        p.hp -= this.atk;
    }

    // protected void degats(float nbrPoints)throws Exception{
    // if (this.isDead()) {
    // throw new Exception("Le pokemon")
    // }
    // }
    /* Methode toString */
    @Override
    public String toString() {
        return "Nom : " + nom + " Health Points :" + hp + " a force de base de l’attaque  : " + atk;
    }

    // @Override
    // public String toString() {
    // return "Nom: " + nom + "\nNiveau: " + niveau + "\nType: " + type;
    // }

    /* setter */
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    /* getter */

    public String getNom() {
        return this.nom;
    }

    public int getHp() {
        return this.hp;
    }

    public int getAtk() {
        return this.atk;
    }

}
