package ville;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Ville ville = new Ville(null, 0);
        Monument monument1 = new Monument("a", "b", 1);
        Monument monument2 = new Monument("a", "b", 1);

        List<Monument> monument = new ArrayList<>();
        monument.addAll(Arrays.asList(monument1, monument2));
        Capitale capitale = new Capitale("A", 10, null, null, 0, List.of(monument1, monument2));

        System.out.println(capitale);

    }
}
