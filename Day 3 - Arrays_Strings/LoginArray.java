import java.util.Scanner;
public class LoginArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       
        String[] username = {"user", "priya", "admin"};
        String[] password = {"12345", "67890", "109283"};

        System.out.println("Enter valid username:");
        String enteredusername = sc.nextLine();

        System.out.println("Enter password:");
        String enteredpassword = sc.nextLine(); 

        boolean found = false;

        for (int i=0 ; i<username.length ; i++){
            if(enteredusername.equals(username[i]) && enteredpassword.equals(password[i])){
            found = true;
            break;
            }
        }

        if (found){
            System.out.println("Login Successful..!!");
        }
        else{
            System.out.println("Invalid Credentials");
        }
        sc.close();
    }
}

