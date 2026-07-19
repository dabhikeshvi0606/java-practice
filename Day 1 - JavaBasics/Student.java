public class Student
{
	public static void main(String arg[])
	{
		//taking user input for student details
		String Rno = arg[0];
        String Name = arg[1];
        double Score = Double.parseDouble(arg[2]);
        long Phno = Long.parseLong(arg[3]);
        
        //printing student details
        System.out.print("Name: " + Name + "\t");
        System.out.println("Roll Number: " + Rno);
        System.out.print("Score: " + Score + "\t");
        System.out.println("Phone Number: " + Phno);
    }
}
	