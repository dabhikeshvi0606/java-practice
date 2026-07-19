import java.util.Scanner;
public class AgeCategories {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if(age >= 0 && age <= 12)
            System.out.println("Child");
           
        else if(age > 12 && age <= 19)
            System.out.println("Teenager");
          
        else if(age > 19 && age <= 59)
            System.out.println("Adult");
               
        else
            System.out.println("Senior Citizen");
                          
        sc.close();
    }
}

