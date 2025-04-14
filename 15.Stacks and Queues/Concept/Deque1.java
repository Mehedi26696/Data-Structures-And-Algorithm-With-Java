

import java.util.LinkedList;
import java.util.Deque;

public class Deque1 {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        
        // addFirst() add element at the beginning of the deque
        deque.addFirst(1);
        deque.addFirst(2);

        // addLast() add element at the end of the deque
        deque.addLast(3);
        deque.addLast(4);

        // print the deque
        System.out.println(deque);
        
        // peekFirst() return the first element of the deque
        System.out.println(deque.peekFirst());
        // peekLast() return the last element of the deque
        System.out.println(deque.peekLast());
        
        // pollFirst() return and remove the first element of the deque
        System.out.println(deque.pollFirst());

        // pollLast() return and remove the last element of the deque
        System.out.println(deque.pollLast());

        // print the deque
        System.out.println(deque);
        
        // push() add element at the beginning of the deque
        deque.push(1);
        deque.push(2);
        deque.push(3);
        
        // print the deque
        System.out.println(deque);
        
        // pop() return and remove the first element of the deque
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        
        // print the deque
        System.out.println(deque);
        
        // offerFirst() add element at the beginning of the deque
        deque.offerFirst(1);
        deque.offerFirst(2);

        // offerLast() add element at the end of the deque
        deque.offerLast(3);
        deque.offerLast(4);
        
        // print the deque
        System.out.println(deque);


    }
    
}
