import java.util.LinkedList;
import java.util.Queue;

public class Queue {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("Elemento 1");
        myQueue.add("Elemento 2");
        myQueue.add("Elemento 3");

        System.out.println("Elemento no topo da fila: " + myQueue.peek());
        System.out.println("Elemento removido da fila: " + myQueue.poll());
        System.out.println("Elementos restantes na fila: " + myQueue);
    }
}
