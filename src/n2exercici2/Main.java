package n2exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.addAll(Arrays.asList(1, 34, 39, 26, 121, 11));
		
		
		System.out.println(oddAndEvenList(list));
	}
	
	public static String oddAndEvenList(List<Integer> list) {
		return list.stream().map( n ->  (n % 2 == 0)? "e".concat(n.toString())
											 : "o".concat(n.toString()) )
					 .collect(Collectors.joining(", ")).toString();
	}
}
