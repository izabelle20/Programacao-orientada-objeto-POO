import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Maca");
        myList.add("Banana");
        myList.add("Abobora");

        System.out.println("Elementos da ArrayList:");
        for (String element : myList) {
            System.out.println(element);
        }
    }
}

