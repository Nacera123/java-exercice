package livres;

import java.util.ArrayList;

import employes.Override;

public class Livres {

    private String titre;
    private String auteur;
    private float prix;
    private int nbrPages;
    private String propritaire;

    /* Constructeur */
    public Livres(String titre, String auteur, float prix, int nbrPages, String propritaire) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nbrPages = nbrPages;
        this.propritaire = propritaire;
    }

    /* Methode toString */
    @Override
    public String toString() {
        return "Nom du livre :" + titre + " ecrit par " + auteur + " son prix est de " + prix
                + " et son nombres de pages. " + nbrPages + " son proprietaire est :" + propritaire;
    }
    /*
     * Methode echanger
     */

    public void echanger(Livres proprietaire2) {
        String intermediaire = this.propritaire;
        this.propritaire = proprietaire2.getProprietaire();
        proprietaire2.setProprietaire(intermediaire);
        ;
    }

    /* Setter */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setPrix(float prix) {
        this.auteur = auteur;
    }

    public void setNbrPages(int nbrPages) {
        this.nbrPages = nbrPages;
    }

    public void setProprietaire(String propritaire) {
        this.propritaire = propritaire;
    }

    /* Getter */

    public String getTitre() {
        return this.titre;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public float getPrix() {
        return this.prix;
    }

    public int getNbrPages() {
        return this.nbrPages;
    }

    public String getProprietaire() {
        return this.propritaire;
    }
}
