package ville;

import java.util.List;

public class Capitale extends Ville {

    private List<Monument> monument;

    /* Constructeur */
    public Capitale(String nom, long nbrHabitant,
            String nomMonument, String adresse, float tarif, List<Monument> monument) {
        super(nom, nbrHabitant);
        this.monument = monument;
    }

    /* setter */

    public void setMonument(List<Monument> monument) {
        this.monument = monument;
    }

    /* Getter */

    public List<Monument> getMonument() {
        return this.monument;
    }

    /* to String */
    public String toString() {
        String string = super.toString();
        for (Monument monument : this.monument) {
            string += monument;
        }
        return string;
    }
}
