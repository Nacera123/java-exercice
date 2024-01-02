package employes;

import java.util.List;

public class Responsables extends Employes {
    private List<Employes> inferieursHierarchiques;

    /* Constructeur */
    public Responsables(String nom, String matricule, float indiceSalarial, List<Employes> inferieursHierarchiques) {
        super(nom, matricule, indiceSalarial);
        this.inferieursHierarchiques = inferieursHierarchiques;
    }

    /* setter */

    public void setInferieursHierarchiques(List<Employes> inferieursHierarchiques) {
        this.inferieursHierarchiques = inferieursHierarchiques;
    }

    /* getter */

    public List<Employes> getInferieursHierarchiques() {
        return this.inferieursHierarchiques;
    }

    /* Afficher la liste des subordonnés */

    public void displaySub() {
        for (Employes employes : this.inferieursHierarchiques) {
            System.out.println(employes.getNom() + " " + employes.getMatricule());
        }
    }
}
