package livres;

import java.util.ArrayList;

public class AlbumsAcolorier extends Livres {
    private ArrayList<Integer> pagesColoriees = new ArrayList<>();

    /* Constructeur */
    public AlbumsAcolorier(String titre, String auteur, float prix, int nbrPages, String propritaire,
            ArrayList<Integer> pagesColoriees) {
        super(titre, auteur, prix, nbrPages, propritaire);
        this.pagesColoriees = pagesColoriees;
    }

    /**
     * Cette méthode elle permet de colorier une page
     * 
     * @param numPage
     */
    public void addColorPage(int numPage) {
        // code ici c'est entre toi et toi :D

    }

    /* Methode to string */
    public String toString() {

        return "Les pages coloriées sont : " + pagesColoriees;
    }
    /* Setter */

    public void setPagesColoriees(ArrayList<Integer> pagesColoriees) {
        this.pagesColoriees = pagesColoriees;

    }
    /* getter */

    public ArrayList<Integer> getPagesColoriees() {
        return this.pagesColoriees;
    }

}
