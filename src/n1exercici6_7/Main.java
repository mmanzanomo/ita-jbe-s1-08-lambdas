package n1exercici6_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<Object>();

        list.addAll(Arrays.asList("Colegi", 202, "Carrer", "Botiga", "Pilota", 6050, "banc", "Edifici"));

        // n1Exercici6 
        list.sort( Comparator.comparing( e -> e.toString().length()) );
        System.out.println(list);

        // n1Exercici7
        Collections.reverse(list);
        System.out.println(list);

    }
}
