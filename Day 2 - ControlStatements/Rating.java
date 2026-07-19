import java.util.Scanner;
public class Rating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rating where 1 is lowest and 5 is highest:");
        int rating = sc.nextInt();
        
        switch(rating) {
            case 1:
                System.out.println("Terrible");
                break;
            case 2:
                System.out.println("Poor");
                break;
            case 3:
                System.out.println("Average");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Invalid rating");            
        }
        sc.close();
    }
}
