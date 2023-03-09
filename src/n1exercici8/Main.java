package n1exercici8;

public class Main {

	public static void main(String[] args) {
		IReverse reverse = s -> new StringBuilder(s).reverse().toString();
		String string = "This is a message";
		
		System.out.println(reverse.reverse(string));
	}

}



