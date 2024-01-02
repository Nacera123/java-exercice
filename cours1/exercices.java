public class exercices {

    /**
     * Déclarer une fonction qui compte le nombre de fois
     * ou une valeur est présente dans un tableau de nombre entier
     * 
     * par exemple
     * si je choisis le nombre 9 dans
     * le tableau {4, -5, 9, 18, 149, 9, 4, 9}
     * La fonction retourne 3.
     * Si le nombre n'est pas trouvé, retourne -1
     * Le tableau et la valeur recherché sont passé en argument
     * 
     */

    public static int compte(int[] array, int nombre) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == nombre) {
                count += 1;
            }
        }
        if (count > 0) {
            return count;
        } else {
            return -1;
        }

    }

    /* Condition ternaire */
    public static int compte1(int[] array, int nombre) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == nombre) {
                count += 1;
            }
        }
        // ma condition ternaire
        return count > 0 ? count : -1;
    }

    public static void main(String[] args) {
        int[] tableau;
        tableau = new int[] { 4, -5, 9, 18, 149, 9, 4, 9 };
        System.out.println("le nombre d'iteration est de : " + compte(tableau, 9));
        System.out.println("le nombre d'iteration est de : " + compte1(tableau, 7));
    }
    /*
     * On peut remplacer la boucle FOR par une boucle FOREACH
     * si on veut parcourir un tableau et que l'on n'a pas
     * besoin des indices
     * 
     * SYNTAXE:
     * for(type variableValeur : tableau){ ... }
     * for (int valeur : tableau) {
     * if(valeur == nombreRecherche){
     * compteur ++
     * }
     * }
     * variableValeur est une variable du même type que les valeurs du tableau.
     * À chaque itération (= tour),
     * variableValeur va prendre la valeur suivante du tableau.
     */

}
