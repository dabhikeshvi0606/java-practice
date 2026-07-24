import java.sql.Connection;
import java.sql.PreparedStatement;


public class StudentDAO {

    public void addStudent(Student student) {

        String sql =
                "INSERT INTO student(name,age,branch) VALUES(?,?,?)";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getBranch());

            ps.executeUpdate();

            System.out.println("Student Added Successfully");

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

  }