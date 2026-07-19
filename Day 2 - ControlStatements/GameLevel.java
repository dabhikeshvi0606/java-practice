import java.util.Scanner;
public class GameLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your game level:");
        int level = sc.nextInt();
        
        switch(level) {
            case 1:
                System.out.println("Easy");
                break;
            case 2:
                System.out.println("Medium");
                break;
            case 3:
                System.out.println("Hard");
                break;
            default:
                System.out.println("Invalid level");            
        }
        sc.close();
    }
}
