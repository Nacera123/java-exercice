package livres;

import java.util.ArrayList;

public class BandesDessinees extends Livres {

    private boolean estColorie;

    /* Constructeur */

    public BandesDessinees(String titre, String auteur, float prix, int nbrPages, String propritaire,
            ArrayList<Integer> pagesColoriees) {
        super(titre, auteur, prix, nbrPages, propritaire);
        this.estColorie = estColorie;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " ce livre est " + estColorie;
    }

    /* setter */

    public void setEstColorie(boolean estColorie) {
        this.estColorie = estColorie;

    }

    /* Getter */
    public boolean getEstColorie() {
        return this.estColorie;
    }
}
