import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for 3 subjects:");
        System.out.print("Subject 1: ");
        int s1 = sc.nextInt();
        System.out.print("Subject 2: ");
        int s2 = sc.nextInt();
        System.out.print("Subject 3: ");
        int s3 = sc.nextInt();

        if (s1 >= 40 && s2 >= 40 && s3 >= 40) {
            int total = s1 + s2 + s3;
            double avg = total / 3.0; 

            System.out.println("\nTotal: " + total + " | Average: " + avg);

            char grade;
            if (avg >= 90) grade = 'A';
            else if (avg >= 80) grade = 'B';
            else if (avg >= 70) grade = 'C';
            else grade = 'D';

            System.out.println("Grade: " + grade);
        } 
        else {
            System.out.println("\nResult: FAIL ");
        }

        sc.close();
    }
}