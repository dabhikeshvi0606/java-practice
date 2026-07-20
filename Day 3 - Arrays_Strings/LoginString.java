import java.util.Scanner;
public class LoginString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String username = "user";
        int password = 12345;

        System.out.println("Enter valid username:");
        String enteredusername = sc.nextLine();

        System.out.println("Enter password:");
        int enteredpassword = sc.nextInt();

        if(enteredusername.equals(username) && enteredpassword == password){
            System.out.println("Login Successful...!!");
        }
        else{
            System.out.println("Invalid Credentials");
        }

        sc.close();
    }
}
