public class fonctions {

    /* Creation d'une variable global */
    public static int global = 0;
    /* Creation d'une constante */
    public static final double pi = 3.14159;

    /*
     * les mots en bleue sont le mot reservé par le language
     * le type de fonction String est ce que la fonction
     * va retourner
     * ensuite on a le nom de la fonction
     * ensuite (les args qu'elle prend avec leur types) entre parenthes
     */
    public static String salutation(String prenom) {
        return "Bonjour " + prenom;
    }

    public static void vide() {
        System.out.println("c'est une fonction void");
    }

    public static double carre(double x) {
        return x * x;
    }

    public static double circonference(double rayon) {
        double total = rayon * rayon * pi;
        return total;
    }

    public static void exercice() {
        /*
         * Exo : dans cette fonction, affichez tous les
         * premiers nombres suivis de leur carré (en utilisant
         * la fonction carre).
         * ex:
         * 1 au carré a 1
         * 2 au carré a 4
         * .....
         */

        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " son carre est : " + carre(i));
        }
    }

    public static double surface(double rayon) {
        return pi * carre(rayon);
    }

    public static void exercice2() {
        /*
         * Exo: Ajouter une fonction qui calcule la surface
         * d'un cercle (pi multiplié par le rayon au carré).
         * le rayon (type double) sera passé en argument.
         * Affichez toutes les surfaces des cecrcles qui ont
         * un rayon entre 1 et 100 contimetre sauf pour
         * les rayons compris entre 32 et 53 centimetre.
         * le résultat doit ressembler a :
         * 
         * Un cercle de .... centimetres à une surface de .. cm²
         */

        for (int i = 1; i < 100; i++) {
            if (i <= 32 || i >= 53) {
                System.out.println("Un cercle de " + i + " centimetres à une surface de  " + surface(i) + " cm²");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(salutation("toto"));
        vide();

        int nb = 7;
        double total = carre(nb);
        int glob = nb * global;
        System.out.println("Le resultat de " + nb + " au carré est " + total);
        System.out.println(" le carré est " + total + " x la variable global " + global + " = " + glob);
        System.out.println("La circonference est de : " + circonference(3));
        exercice();
        exercice2();
    }
}
