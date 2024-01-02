package vehicule;

public class Vehicule {

    public String marque;
    public int anneeAchat;
    public float prixAchat;

    /* Constructeur */

    public Vehicule(String marque, int anneeAchat, float prixAchat) {
        this.marque = marque;
        this.anneeAchat = anneeAchat;
        this.prixAchat = prixAchat;
    }

    /* Methode calcul prix */

    public float calculePrix(int anneActuelle) {

        float prixCourant = this.anneeAchat;

        for (int i = this.anneeAchat; i <= anneActuelle; i++) {
            prixCourant = this.prixAchat - (this.prixAchat * 0.01f);

        }
        setPrixAchat(prixCourant);
        return this.prixAchat;
    }

    /* setter */
    public void setMarque(String marque) {
        this.marque = marque;

    }

    public void setAnneeAchat(int anneeAchat) {
        this.anneeAchat = anneeAchat;
    }

    public void setPrixAchat(float prixAchat) {
        this.prixAchat = prixAchat;
    }

    /* getter */
    public String getMarque() {
        return this.marque;
    }

    public int getAnneeAchat() {
        return this.anneeAchat;
    }

    public float getPrixAchat() {
        return this.prixAchat;
    }

    /* to String */
    public void affiche() {
        System.out.println("La voiture de la marque : " + marque +
                " achetée en " + anneeAchat + " au prix de " + prixAchat + "\n");
    }

}
