import java.util.Scanner;
public class CarSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed of car:");
        int speed = sc.nextInt();
        if (speed <= 60){
            System.out.println("Normal speed");
        }
        else{
            System.out.println("Over speeding- Fine applicable");
        }
        sc.close();
    }

}


