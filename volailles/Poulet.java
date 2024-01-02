package volailles;

public class Poulet extends Volaille {

    private float prix;
    private float poidsAbattage;

    /* Constructeur */
    public Poulet(float poids, int numIdentification) {
        super(poids, numIdentification);
        this.prix = 4.5f;
        this.poidsAbattage = 1.5f;
    }

    /* setter */
    /* Abattage poulet */
    public boolean isMature() {
        return super.getPoids() >= this.getPoidsAbattage();
    }

    /* Prix */
    public float prix() {
        return this.prix * super.getPoids();
    }

    public void setPrix(float prix) {
        this.prix = prix;

    }

    public void setPoidsAbattage(float poidsAbattage) {
        this.poidsAbattage = poidsAbattage;
    }

    /* Getter */

    public float getPrix() {
        return this.prix;
    }

    public float getPoidsAbattage() {
        return this.poidsAbattage;
    }

    /* Methode to String */

    // public String toString() {
    // return super.toString() + " son prix de vente est de : " + prix + " ets son
    // poids d'abattage est de : "
    // + poidsAbattage;
    // }
}
