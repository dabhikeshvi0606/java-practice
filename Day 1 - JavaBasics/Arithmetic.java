import java.util.Scanner;

public class Arithmetic
{
  public static void main(String arg[]) 
    {
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      double b = scanner.nextDouble();

    // Addition
      double sum = a + b;
      System.out.println("Sum:"+ sum);

    // Subtraction
      double difference = a - b;
      System.out.println("Difference: " + difference);

    // Multiplication
      double product = a * b;
      System.out.println("Product: "+ product);

    // Division
      double quotient = a / b;
      System.out.println("Quotient:"+ quotient);

    // Modulus
      double remainder = a % b;
      System.out.println("Remainder: " + remainder);

      scanner.close();
    }
}
