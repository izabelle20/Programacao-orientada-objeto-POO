import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;

public class AbstractSet {
    public static void main(String[] args) {
        AbstractSet<Integer> myAbstractSet = new HashSet<>();
        myAbstractSet.add(1);
        myAbstractSet.add(2);
        myAbstractSet.add(3);

        Iterator<Integer> iterator = myAbstractSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
