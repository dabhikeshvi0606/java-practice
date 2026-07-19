import java.util.Scanner;
public class temperature {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current temperature:");
        int temp = sc.nextInt();

        if (temp>35) {
            System.out.println("Stay hydrated! It's a hot day.");
        }
        else{
            System.out.println("The weather is pleasant. Enjoy your day!");
        }
        sc.close();
    }
}



