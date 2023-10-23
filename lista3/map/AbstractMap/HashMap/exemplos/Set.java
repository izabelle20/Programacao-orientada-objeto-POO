import java.util.HashSet;
import java.util.Set;

public class Set {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("Element 1");
        mySet.add("Element 2");
        mySet.add("Element 2"); 

        System.out.println(mySet);
    }
}
