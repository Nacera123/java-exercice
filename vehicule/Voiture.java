package vehicule;

public class Voiture extends Vehicule {

    public int cylindree;
    public int nbrPorte;
    public int puissance;
    public float kilometrage;

    /* Constructeur */
    public Voiture(String marque, int anneeAchat, float prixAchat, int cylindree, int nbrPorte, int puissance,
            float kilometrage) {
        super(marque, anneeAchat, prixAchat);
        this.cylindree = cylindree;
        this.nbrPorte = nbrPorte;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    /* Methode calcul prix pour une voiture */

    public float calculePrix(int anneActuelle) {

        float prixCourant = super.anneeAchat;

        for (int i = super.anneeAchat; i <= anneActuelle; i++) {
            prixCourant = super.prixAchat - (super.prixAchat * 0.02f);
            prixCourant -= (prixCourant * (this.kilometrage * 0.05f / 10000f));
            if (super.marque == "Renault" || super.marque == "Fiat") {

                prixCourant -= (prixCourant * (this.kilometrage * 0.1f / 10000f));
            } else if (super.marque == "Ferrari" || super.marque == "Porsche") {
                prixCourant -= (prixCourant * (this.kilometrage * 0.2f / 10000f));
            }
        }
        super.setPrixAchat(prixCourant);
        return super.prixAchat;
    }

    /* setter */

    public void setCylindree(int cylindree) {
        this.cylindree = cylindree;

    }

    public void setNnbrPorte(int nbrPorte) {
        this.nbrPorte = nbrPorte;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public void setKilometrage(float kilometrage) {
        this.kilometrage = kilometrage;
    }

    /* getter */

    public int getCylindree() {
        return this.cylindree;
    }

    public int getNnbrPorte() {
        return this.nbrPorte;
    }

    public int getPuissance() {
        return this.puissance;
    }

    public float getKilometrage() {
        return this.kilometrage;
    }

    /* Methode toString */

    public void affiche() {
        super.affiche();
        System.out.println(" il a " + cylindree + " cylindres" + " il  a " + nbrPorte + " portes, et une puissance de "
                + puissance + " elle a roulé " + kilometrage + " kilometres");
    }
}
