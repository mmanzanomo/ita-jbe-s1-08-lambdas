package n2exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.addAll(Arrays.asList("Ana", "Carlos", "Eva", "Ricardo", "Ada", "Alicia", "Alberto"));
		
		list.stream().filter( s -> s.length() == 3 && s.startsWith("A") ).forEach(System.out::println );;
	}

}
