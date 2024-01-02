package employes;

public class Commercial extends Employes {
    private int nbrVentes;
    private float multiplicateurVente;

    public Commercial(String nom, String matricule, float indiceSalarial, int nbrVentes) {
        super(nom, matricule, indiceSalarial);
        this.nbrVentes = nbrVentes;
        this.multiplicateurVente = 10;

    }

    @Override
    public float salaire() {
        /*
         * c'est le salaire de base qui vient de la class Employe (super.salaire()) +
         * ces gains mensuels ((this.nbrVentes + this.multiplicateurVente))
         */
        return super.salaire() + (this.nbrVentes + this.multiplicateurVente);
    }

    /* setter */

    public void setNbrVentes(int nbrVentes) {
        this.nbrVentes = nbrVentes;
    }

    public void setMultiplicateurVente(float multiplicateurVente) {
        this.multiplicateurVente = multiplicateurVente;
    }

    /* getter */

    public int getNbrVentes() {
        return this.nbrVentes;
    }

    public float getMultiplicateurVente() {
        return this.multiplicateurVente;
    }

}
