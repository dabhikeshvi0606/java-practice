import java.util.Scanner;
public class Student_details
{
	public static void main(String arg[])
	{
		//taking user input for student details using predefined class
		Scanner s = new Scanner(System.in);
        System.out.println("Enter student Name:");		
        String Name = s.next();
		System.out.println("Enter student Roll Number:");
		int Rno= s.nextInt();
		System.out.println("Enter score obtained:");
        double Score = s.nextDouble();
        
        //printing student details
		System.out.println(" \n"); //prints on the next line 
		System.out.println("Student Details");
        System.out.println("Name: " + Name );
        System.out.println("Roll Number: " + Rno);
        System.out.println("Score: " + Score );

		s.close();
    }
}
