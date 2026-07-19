import java.util.Scanner;
public class BillAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total bill amount:");
        int amount = sc.nextInt();
        if (amount > 500){
            System.out.println("congratulations! you have earned a gift voucher");
        }
        else{
            System.out.println("Thankyou for shopping with us!");
        }
        sc.close();
    }

}
