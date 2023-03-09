package n1exercici2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Rana");
        list.add("Sapo");
        list.add("Saltamontes");
        list.add("Elefante");
        list.add("Pájaro");

        // Prints all strings containing 'o' and are longer than 5 letters
        list.stream().filter( s -> s.contains("o") && s.length() > 5 ).forEach( System.out::println );
    }
}
