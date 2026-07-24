public class Main {
    public static void main(String[] args)
    {
        StudentDAO dao = new StudentDAO();
        Student s = new Student("sony", 31, "CS");

        dao.addStudent(s);
    }
}
