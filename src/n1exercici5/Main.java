package n1exercici5;

public class Main {
    public static void main(String[] args) {
        FunctionalPiValue pi = () -> 3.1415;

        System.out.println(pi.getPiValue());
    }

}

