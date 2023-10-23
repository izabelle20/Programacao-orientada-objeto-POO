import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "John");
        myMap.put(2, "Doe");
        myMap.put(3, "Jane");

        System.out.println("Exemplo de HashMap:");
        for (Integer key : myMap.keySet()) {
            System.out.println("Key: " + key + " Value: " + myMap.get(key));
        }
    }
}
