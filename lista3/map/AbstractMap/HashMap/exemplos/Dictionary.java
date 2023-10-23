import java.util.Dictionary;
import java.util.Hashtable;

public class Dictionary {
    public static void main(String[] args) {
        Dictionary<String, String> myDictionary = new Hashtable<>();
        myDictionary.put("chave1", "Valor1");
        myDictionary.put("chave2", "Valor2");

        System.out.println("Valor chave1: " + myDictionary.get("chave1"));
        System.out.println("Valor chave2: " + myDictionary.get("chave2"));
    }
}
