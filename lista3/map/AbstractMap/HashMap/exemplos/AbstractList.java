import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class AbstractList {
    public static void main(String[] args) {
        AbstractList<String> myAbstractList = new ArrayList<>();
        myAbstractList.add("Element 1");
        myAbstractList.add("Element 2");
        myAbstractList.add("Element 3");

        System.out.println(myAbstractList);
    }
}

