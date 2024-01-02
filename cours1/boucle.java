import java.util.Scanner;

public class boucle {

    public static void exercice1() {
        /* structure itirtive */

        // for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("******* imprimer les nombres impaires *******");

        for (int i = 5; i < 20; i++) {
            System.out.println(i++);
        }
        System.out.println("******* imprimer les nombres paires *******");

        for (int i = 5; i < 20; i++) {
            System.out.println(++i);
        }

        // WHILE
        int i = 0;
        while (i < 20) {
            i++;
            System.out.println("i= " + i);
        }
        while (i < 20) {
            System.out.println(i++);
        }
        while (++i < 20) {
            System.out.println(i);
        }

        // DO WHILE
        i = 10;
        do {
            System.out.println(i);
        } while (i < 10);

        i = 10;
        while (i < 10) {
            System.out.println(i);
        }

        Scanner scan = new Scanner(System.in);
        int val = 0;

        System.out.println("veuillez taper un nombre entier :");
        // val = scan.nextInt(); // trnasforme les valeur en entier
        System.out.println("la valeur tapée est " + val);
        System.out.println(scan);

        /*
         * EXO : demander a l'utilisateur de taper un nombre
         * Tant que l'utilisateur n'a pas tapé le nombbre 3,
         * il faut continuer a lui demander
         * Quand il a taper 3, afficher le nombre de tentative
         */

        int incrementScan = 0;
        while (val != 3) {
            val = scan.nextInt();
            incrementScan++;
            if (val == 3) {
                System.out.println("Nombre de tentatives1 : " + incrementScan);
            }

        }

        int cpt = 0;
        do {
            System.out.println("veuillez taper un nombre entier :");
            /*
             * La variable scan de type Scanner permet de récuperer
             * les saisies au clavier
             */
            val = scan.nextInt();
            cpt++;
        } while (val != 3);
        System.out.println("Nombre de tentatives2 : " + cpt);

    }

    public static void main(String[] args) {
        exercice1();
    }
}
