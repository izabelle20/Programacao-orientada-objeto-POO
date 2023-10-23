import java.util.AbstractMap;
import java.util.Hashtable;
import java.util.Map;

public class AbstractMap{
    public static void main(String[] args) {
        AbstractMap<String, String> myAbstractMap = new Hashtable<>();
        myAbstractMap.put("chave1", "Valor1");
        myAbstractMap.put("chave2", "Valor2");


        for (Map.Entry<String, String> entry : myAbstractMap.entrySet()) {
            System.out.println("chave: " + entry.getchave() + ", Valor: " + entry.getValor());
        }
    }
}
