import java.util.Scanner;
public class StudentMarks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total marks:");
        int marks = sc.nextInt();
        if (marks >= 40){
            System.out.println("Passed");
        }
        else if (marks > 100){
            System.out.println("Invalid marks");
        }
        else{
            System.out.println("Failed");
        }
        sc.close();
    }
}
