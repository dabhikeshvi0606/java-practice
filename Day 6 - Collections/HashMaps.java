import java.util.HashMap;

public class HashMaps{
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        
        map.put(1, "Rahul");
        map.put(2, "Priya");
        map.put(3, "Sarayu");

        System.out.println(map);

        System.out.println(map.get(2));

        map.remove(2);

        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map.containsKey(1));

        // for(Type variable : collection)
        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

    }
}