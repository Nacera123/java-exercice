package volailles;

public class Volaille {

    private float poids;
    private int numIdentification;

    /* Constructeur */

    public Volaille(float poids, int numIdentification) {
        this.poids = poids;
        this.numIdentification = numIdentification;
    }

    /* Abattage poulet */
    public boolean isMature() {
        return false;
    }
    /* Setter */

    public void setPoids(float poids) {
        this.poids = poids;

    }

    public void setNumIdentification(int numIdentification) {
        this.numIdentification = numIdentification;

    }

    /* Getter */
    public float getPoids() {
        return this.poids;
    }

    public int getNumIdentification() {
        return this.numIdentification;
    }

    /* Methode to string */

    public String toString() {
        return "son poids est de : " + poids +
                " et son numéro d'identification est le : " + numIdentification + "\n";
    }

}
