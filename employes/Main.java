package employes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* Instanciation de tout les employe */
        Employes developpeur = new Employes("toto dev", "a1b2c3", 1.2f);
        Employes testeur = new Employes("toto testeur", "a3b2c1", 1f);
        Commercial commercial = new Commercial("toto commercial", "a5b6c7", 0.9f, 5);

        /* Attribuer ces employes au responsable */
        /*
         * 1- dabord créer un tableau vide
         * 2- ensuite on crée l'instance mere qui prends en parametre du consttructeur
         * le tableau vide deja crée
         * 3- pusher dans le tableau les employe
         * 
         */
        List<Employes> sub = new ArrayList<>();
        Responsables directeur = new Responsables("toto boss", "z10y11x12", 2, sub);
        sub.add(developpeur);
        sub.add(testeur);
        sub.add(commercial);

        System.out.println(
                directeur.getNom() + " " + directeur.getMatricule() + " " + directeur.getMultiplicateurSalaire() + " "
                        + directeur.getIndiceSalarial()
                        + " " + directeur.salaire());
        directeur.displaySub();

        /* sommer les salaires */
        List<Employes> mesEmployes = new ArrayList<>();
        mesEmployes.add(developpeur);
        mesEmployes.add(testeur);
        mesEmployes.add(directeur);
        mesEmployes.add(commercial);

        float salaire = 0;
        for (Employes employes : mesEmployes) {
            salaire += employes.salaire();
        }
        System.out.println(salaire);
    }
}
