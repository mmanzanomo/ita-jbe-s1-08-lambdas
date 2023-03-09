package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Barcelona");
        list.add("Albacete");
        list.add("Oviedo");
        list.add("Zaragoza");
        list.add("Valencia");

        // Prints all strings containing 'o'
        list.stream().filter( e -> e.contains("o") ).forEach(System.out::println);
    }
}