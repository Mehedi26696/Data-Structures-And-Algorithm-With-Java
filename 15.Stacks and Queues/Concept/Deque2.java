import java.util.ArrayDeque;
import java.util.Deque;

public class Deque2 {
    
    public static void main(String[] args) {
        Deque<Integer>  deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(6);

        System.out.println(deque);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println(deque);

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        System.out.println(deque);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

        System.out.println(deque);
 
    }
}
