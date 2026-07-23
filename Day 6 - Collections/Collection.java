import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Collection {
    public static void main(String[] args) {

        // ArrayList to store student names
        ArrayList<String> studentNames = new ArrayList<>();

        // HashMap to store Roll Number -> Student Name
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Add 5 students
        studentNames.add("Aishu");
        studentNames.add("Anki");
        studentNames.add("Sarayu");
        studentNames.add("Greesh");
        studentNames.add("Teju");

        studentMap.put(101, "Aishu");
        studentMap.put(102, "Anki");
        studentMap.put(103, "Sarayu");
        studentMap.put(104, "Greesh");
        studentMap.put(105, "Teju");

        // Print all student names
        System.out.println("---- Student Names ----");
        for (String student : studentNames) {
            System.out.println(student);
        }

        // Print total number of students
        System.out.println("\nTotal Students: " + studentNames.size());

        // Print Roll Number and Student Name
        System.out.println("\n---- Student Details ----");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() +
                    " | Name: " + entry.getValue());
        }

        // Search student by roll number
        int rollNo = 103;
        if (studentMap.containsKey(rollNo)) {
            System.out.println("\nStudent with Roll No " + rollNo +
                    ": " + studentMap.get(rollNo));
        } else {
            System.out.println("\nStudent not found.");
        }
    }
}
