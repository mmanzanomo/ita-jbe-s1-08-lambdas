package n2exercici4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		
		list.addAll(Arrays.asList("Blau", "Vermell", 22, "Verd", 12));
		
		System.out.println("Ordenar alfabèticament:");
		list.sort(Comparator.comparing( e -> e.toString().charAt(0) ));
		list.forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		System.out.println("\nSi conte 'e', primer:");
		list.sort(Comparator.comparing( e -> e.toString().contains("e") ).reversed());
		list.forEach(e -> System.out.print(e + ", "));
		System.out.println();
		
		System.out.println("\nModifica la 'a' per '4':");
		list = list.stream().map(e -> e.toString().replace("a", "4")).collect(Collectors.toList());
		list.forEach(e -> System.out.print(e + ", "));
		System.out.println();
		
		System.out.println("\nMostra valors numerics");
		list = list.stream().filter( e -> e.toString().matches("[0-9]+")  ).collect(Collectors.toList());
		list.forEach(e -> System.out.print(e + " "));
		System.out.println();
		
	}
}
