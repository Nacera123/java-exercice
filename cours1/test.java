class test {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("deuxieme ligne");

        // variable
        /**
         * Declaration d'une variable : syntaxe
         * type nomDeLaVariable
         */

        int a;
        double b;
        float f;
        String texte;
        boolean vf;

        /**
         * Effectation d'une variable: donner une valeur
         * L'operateur d'affectation est le caractere =
         * 
         */
        a = 5;
        b = 2.7;
        f = 1.2f;
        texte = "ceci est du texte";
        /*
         * pour pouvoir utiliser une pariable il faut d'abord la déclarer et
         * l'initialiser
         */
        b = a + b;

        System.out.println(b);
        /*
         * Une expression est quelque chose quiq a une valeur.
         * Onpeut affecter n'importe quelle expression dans une variable,
         * du moment que le type est compatible
         */

        a = 5 + 2;
        b = a - .5;
        b = b - .5;
        System.out.println(b);

        /**
         * CAST : conversion d'un type vers un autre type
         * compatible
         * 
         */

        b = 5.5;
        a = (int) b;
        System.out.println(a);

        /**
         * STRUCTURE CONDITIONNELLE
         * IF ELSE
         * if(condition){
         * //bloc d'instruction si condition vraie
         * }else{
         * //bloc d'instruction si condition fausse
         * }
         * 
         * laa condition est une expression de type boolean
         */
        vf = false;

        if (vf) {
            System.out.println("la valeur est 5");
        }

        /**
         * Declarer une variable nommée jour de type int.
         * Si jour est superieur a 20
         * affichez "c'est la fin du mois"
         * sinon
         * afficher "c'est le debut du mois"
         */

        int jour = 50;
        if (jour < 20) {
            System.out.println("c'est le debut du mois");
        } else {
            System.out.println("c'est la fin du mois");
        }

        if (jour == 1) {
            System.out.println("c'est le 1er jour du mois");

        }
        if (jour != 1) {
            System.out.println("c'est pas le 1er jour du mois");

        }
        /**
         * Qund jour est entre 1 et 10 inclus
         * affichez "début du mois"
         * entre 11 et 20
         * "milieu"
         * entre 21 et 30
         * "fin"
         * 
         * ET &&
         * OU ||
         * NON !
         */

        jour = 50;

        if (jour >= 1 && jour < 11) {
            System.out.println("debut du mois");
        } else if (jour >= 11 && jour < 21) {
            System.out.println("milieu du mois");

        } else if (jour <= 21 && jour < 31) {
            System.out.println("fin du mois");

        } else {
            System.out.println("ce jour du mois n'existe pas");

        }

        // switch
        String semaine = "lundi";
        switch (semaine) {
            case "lundi":
            case "mardi":
                System.out.println("c'est le debut de  la semaine");
                break;
            case "mercredi":
            case "jeudi":
                System.out.println("encore quelque jours courage");
                break;
            case "vendrreedi":
                System.out.println("Enfin demain c'est le week-end");
                break;

            default:
                System.out.println("on se repose pendant le week-end");
        }

        semaine = "mardi";
        if (semaine == "lundi" || semaine == "mardi") {
            System.out.println("c'est le debut de  la semaine");

        } else if (semaine == "mercredi" || semaine == "jeudi") {
            System.out.println("encore quelque jours courage");

        } else if (semaine == "vendredi") {
            System.out.println("Enfin demain c'est le week-end");

        } else {
            System.out.println("on se repose pendant le week-end");

        }

        /// on transforme l'exo jour de semaine de if a sxitch
        jour = 28;
        switch (jour) {
            case 30:
            case 29:
            case 28:
            case 27:
            case 26:
            case 25:
            case 24:
            case 23:
            case 22:
            case 21:
                System.out.println("fin du mois");
                break;
            case 11:
            case 12:
            case 13:
            case 20:
                System.out.println("milieu du mois");
                break;
            case 1:
            case 10:
                System.out.println("milieu du mois");
                break;

            default:
                break;
        }

        /* Operrateur de CONCATENATION */
        String str = "bonjour";
        System.out.println(str + ", bienvenue à tout le monde");
        System.out.println("la valeur  de la variable à " + a);

        /* EXO : affiche la phrase a+5 est egale a "" suivi du résultat de a+5 */
        System.out.println("a+5 est egale a " + (a + 5));

        a = 7;
        System.out.println("avant a = " + a);

        int c = a++;
        b = a + 1;

        System.out.println("b " + b);
        System.out.println("c " + c);
        System.out.println("apres a = " + a);

        a = a + 2;
        a += 2;
        System.out.println(a);
        a = 7;
        a *= 2;
        System.out.println(a);

        /** permutation */
        int nb1 = 12;
        int nb2 = 7;

        int nb3 = nb1;
        nb1 = nb2;
        nb2 = nb3;
        System.out.println(nb1);
        System.out.println(nb2);

        nb1 = nb1 + nb2;
        nb2 = nb1 - nb2;
        nb1 = nb1 - nb2;
        System.out.println(nb1);
        System.out.println(nb2);

    }

}