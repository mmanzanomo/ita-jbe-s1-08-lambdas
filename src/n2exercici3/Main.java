package n2exercici3;

public class Main {

	public static void main(String[] args) {
		IOperators addition = (x, y) -> x + y;
		IOperators substraction = (x, y) -> x - y;
		IOperators multiplication = (x, y) -> x * y;
		IOperators division = (x, y) -> x / y;
		
		System.out.println(addition.operation(2, 3));
		System.out.println(substraction.operation(2, 3));
		System.out.println(multiplication.operation(2, 3));
		System.out.println(division.operation(2, 3));

	}

}
