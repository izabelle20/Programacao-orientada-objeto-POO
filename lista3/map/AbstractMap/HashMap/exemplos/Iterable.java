import java.util.ArrayList;
import java.util.Iterator;

public class Iterable {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Element 1");
        myList.add("Element 2");
        myList.add("Element 3");

        for (String element : myList) {
            System.out.println(element);
        }
    }
}
