import java.lang.reflect.Array;

public class tableaux {

    public static void main(String[] args) {
        /* Déclaration d'un tableau d'entiers */
        int[] tabEntiers;
        int tabEntiers2[];

        /* Initialiser un tableau */
        tabEntiers = new int[] { 5, 15, 7, 32, -5 };

        System.out.println("La 2ieme valeur du tableau est "
                + tabEntiers[1]);

        int somme = tabEntiers[0] + tabEntiers[1];
        System.out.println(somme);

        /* Taille d'un tableau : length */

        System.out.println("La taille du tableau est " +
                tabEntiers.length);

        /* Exo : affcihez toutes les valeurs du tableau */

        for (int i = 0; i < tabEntiers.length; i++) {
            System.out.println(tabEntiers[i]);
        }

        /* Modifier une valeur d'un tableau */
        tabEntiers[2] = 30;

        /*
         * En java les tableaux ne sont pas dynamiques
         * => on ne peut pas changer la taille d'un tableau
         */
        // tabEntiers[5] = 1;

        /* Declaration d'un tableau vide */
        double[] tabDoubles = new double[5];
        /*
         * ici vue que le tableau est vide java donne
         * des valeurs par defaut
         */
        System.out.println(tabDoubles[2]);
        String[] tabString = new String[5];
        /*
         * ici vue que le tableau est vide java donne
         * des valeurs par defaut
         */
        System.out.println(tabString[2]);

        /*
         * Affectez automatiquement des valeurs au tableau :
         * chaque indice du tableau doit contenir
         * le carré de l'indice du tableau
         */
        for (int i = 0; i < tabDoubles.length; i++) {
            tabDoubles[i] = i * i;
            System.out.println(tabDoubles[i]);

        }

        /*
         * Exo : fonction qui affiche toutes les valeurs d'un
         * tableau d'entiers passé en argument.
         * L'affichage doit ressembler a :
         * 1 => 5
         * 2 => 15
         */

        System.out.println("juste la methode");
        for (int i = 0; i < tabEntiers.length; i++) {
            System.out.println((i + 1) + " => " + tabEntiers[i]);
        }

        System.out.println("Appel de la fonction");
        afficheTableau(tabEntiers);
        afficheTableau(tabEntiers, 5);

        String[] mot = new String[] { "Bonjour", "je", "m'appelle", "nacera" };
        afficheTableau(mot);
    }

    public static void afficheTableau(int[] mytab) {

        for (int i = 0; i < mytab.length; i++) {
            System.out.println((i + 1) + " => " + mytab[i]);
        }

    }

    public static void afficheTableau(int[] mytab, int entier) {
        for (int i = 0; i < mytab.length; i++) {
            System.out.println((i + 1) + " => " + (mytab[i] + entier));
        }
    }

    /*
     * Exo : Ajouter une fonction nommée afficheTableau qui prend
     * comme argument un tableau de string
     * la fonction affiche les valeurs du tableau
     * sur une seule ligne
     */

    public static void afficheTableau(String[] mytab) {
        String txt = "";
        for (int i = 0; i < mytab.length; i++) {
            // if (i != mytab.length - 1) {

            // txt += mytab[i] + " ";
            // } else {
            // txt += mytab[i];

            // }

            txt += i != mytab.length - 1 ? mytab[i] + " " : mytab[i];
            /*
             * OPERATEUR TERNAIRE
             * condition ? valeur_si_vraie : valeur_si_faux
             */

        }
        System.out.println(txt + ".");
    }

}
