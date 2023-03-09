package n1exercici3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> months = new ArrayList<String>();

        // Add all months
        months.addAll(Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"));

        // Print all elements with a lambda
        months.forEach(m -> System.out.println(m));

    }


}
