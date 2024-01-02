package ville;

public class Ville {

    private String nom;
    private long nbrHabitant;

    /* Constructeur */

    public Ville(String nom, long nbrHabitant) {
        this.nom = nom;
        this.nbrHabitant = nbrHabitant;
    }

    /* Setter */

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbrHabitant(long nbrHabitant) {
        this.nbrHabitant = nbrHabitant;
    }

    /* Getter */

    public String getNom() {
        return this.nom;
    }

    public long getNbrHabitant() {
        return this.nbrHabitant;
    }

    /* Methode to String */
    public String toString() {
        return "la ville : " + nom + " contient : " + nbrHabitant + " d'habitantts";
    }
}
