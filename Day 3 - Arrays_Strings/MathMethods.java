import java.util.Scanner;

public class MathMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number to test: ");
        double num = sc.nextDouble();

        // Basic alterations
        System.out.println("Absolute : " + Math.abs(num)); //strips negative sign
        System.out.println("Square Root: " + Math.sqrt(Math.abs(num))); 

        // Rounding methods side-by-side
        System.out.println("Round : " + Math.round(num)); //normal rounding
        System.out.println("Ceil : " + Math.ceil(num)); //always rounds UP
        System.out.println("Floor : " + Math.floor(num)); //always rounds DOWN

        // Powers
        System.out.println("Number cubed : " + Math.pow(num, 3));

        // Constants & Random
        System.out.println("Value of PI: " + Math.PI);
        System.out.println("Random number : " + Math.random()); //0.0 to 1.0

        sc.close();
    }
}