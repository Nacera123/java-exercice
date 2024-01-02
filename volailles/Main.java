package volailles;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* creer des poulet */
        Poulet poulet1 = new Poulet(0.5f, 123);
        Poulet poulet2 = new Poulet(0.4f, 345);
        Poulet poulet3 = new Poulet(0.6f, 567);

        /* creer des canards */
        Canard canard1 = new Canard(0.7f, 123);
        Canard canard2 = new Canard(0.6f, 345);
        Canard canard3 = new Canard(0.8f, 567);

        /* L'ensemble des poulets */
        List<Poulet> listPoulet = new ArrayList<>();
        listPoulet.addAll(Arrays.asList(poulet1, poulet2, poulet3));

        /* L'ensemble des canards */
        List<Canard> listCanard = new ArrayList<>();
        listCanard.addAll(Arrays.asList(canard1, canard2, canard3));

        /* L'ensemble des animaux de l'elevage */
        List<Volaille> listVolaille = new ArrayList<>();

        // Ajout de tout les elements d'un coup
        listVolaille.addAll(Arrays.asList(poulet1, poulet2, poulet3, canard1, canard2, canard3));

        // System.out.println(listVolaille);

        /* Definir le poids d'abattage pour toutes les instances Poulet */
        for (Poulet poulet : listPoulet) {
            poulet.setPoidsAbattage(0.5f);
            poulet.setPrix(2f);

            // System.out.println(poulet.getPoidsAbattage());
        }
        System.out.println(poulet1.getPoidsAbattage());

        /* Definir le poids d'abattage pour toutes les instances Canard */
        for (Canard canard : listCanard) {
            canard.setPoidsAbattage(0.7f);
            canard.setPrix(3f);
        }

        /* Trier les animaux a abbatre */
        for (Volaille volaille : listVolaille) {
            if ((volaille instanceof Poulet && ((Poulet) volaille).getPoidsAbattage() <= ((Poulet) volaille).getPoids())
                    || (volaille instanceof Canard
                            && ((Canard) volaille).getPoidsAbattage() <= ((Canard) volaille).getPoids())) {

                System.out.println(volaille);
            }
        }
        float prixTotal = 0;

        for (Volaille volaille : listVolaille) {
            if (volaille instanceof Poulet
                    && ((Poulet) volaille).getPoidsAbattage() <= ((Poulet) volaille).getPoids()) {
                prixTotal += ((Poulet) volaille).getPrix() * ((Poulet) volaille).getPoids();
            } else if (volaille instanceof Canard
                    && ((Canard) volaille).getPoidsAbattage() <= ((Canard) volaille).getPoids()) {
                prixTotal += ((Canard) volaille).getPrix() * ((Canard) volaille).getPoids();
            }
        }

        System.out.println("Prix total : " + prixTotal);

    }
}
