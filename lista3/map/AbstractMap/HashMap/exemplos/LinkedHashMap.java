import java.util.*;
public class LinkedHashMap {

   public static void main(String args[]) {
      LinkedHashMap lhm = new LinkedHashMap();

      lhm.put("Zara", new Double(3434.34));
      lhm.put("Mahnaz", new Double(123.22));
      lhm.put("Ayan", new Double(1378.00));
      lhm.put("Daisy", new Double(99.22));
      lhm.put("Qadir", new Double(-19.08));

      Set set = lhm.entrySet();

      Iterator i = set.iterator();

      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();

      double balance = ((Double)lhm.get("Zara")).doubleValue();
      lhm.put("Zara", new Double(balance + 1000));
      System.out.println("Zara's new balance: " + lhm.get("Zara"));
   }
}