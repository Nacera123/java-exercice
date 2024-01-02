package vehicule;

public class Avion extends Vehicule {

    public String typeMoteur;
    public int nbrHeureVol;

    public Avion(String marque, int anneeAchat, float prixAchat, String typeMoteur, int nbrHeureVol) {
        super(marque, anneeAchat, prixAchat);
        this.typeMoteur = typeMoteur;
        this.nbrHeureVol = nbrHeureVol;
    }

    /* Methode calcul prix pour un avion */

    public float calculePrix(int anneActuelle) {
        float prixCourant = super.prixAchat;

        if (this.typeMoteur == "HELICES") {
            prixCourant -= (0.1 * this.nbrHeureVol / 100);
        } else {
            prixCourant -= (0.1 * this.nbrHeureVol / 1000);
        }
        if (prixCourant < 0) {
            prixCourant = 0f;
        }
        super.setPrixAchat(prixCourant);
        return super.prixAchat;
    }

    /* setter */

    public void setTypeMoteur(String typeMoteur) {
        this.typeMoteur = typeMoteur;

    }

    public void setNbrHeureVol(int nbrHeureVol) {
        this.nbrHeureVol = nbrHeureVol;
    }

    /* Getter */
    public String getTypeMoteur() {
        return this.typeMoteur;
    }

    public int getNbrHeureVol() {
        return this.nbrHeureVol;
    }

    /* Methode affiche */

    public void affiche() {
        super.affiche();
        System.out.println(" son type de moteur et " + typeMoteur + " il a volé " + nbrHeureVol + " heures");
    }
}
