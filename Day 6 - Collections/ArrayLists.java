import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Priya");

        System.out.println(names.get(0));

        names.remove("Priya");

        System.out.println(names.size());

        System.out.println(names.contains("Rahul"));

        names.add("Sarayu");
        names.add("Bob");

        //for(Type variable : collection)
        for(String name : names){
            System.out.println(name);
        }

    }
}
