import java.util.Scanner;
public class LoginAttempts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of failed login attempts:");
        int attempts = sc.nextInt();
        if (attempts == 3){
            System.out.println("Account locked for 30 mins");
        }
        else if (attempts > 3){
            System.out.println("Account locked, try again after 30 mins");
        }
        else{
            System.out.println("Retry logging in");
        }
        sc.close();
    }

}
