import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        // Adding elements
        names.add("Rahul");
        names.add("Priya");
        names.add("Sarayu");
        names.add("Priya"); // Duplicate - will not be added

        // Print all names
        System.out.println("Names: " + names);

        // Check if a name exists
        System.out.println("Contains Rahul: " + names.contains("Rahul"));

        // Remove an element
        names.remove("Rahul");

        // Print size
        System.out.println("Total Names: " + names.size());

        // Iterate through HashSet
        System.out.println("Remaining Names:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}