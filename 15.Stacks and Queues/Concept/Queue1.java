
// Queue is a linear data structure that follows the First In First Out (FIFO) principle.
// In a queue, the element that is added first is the one that is removed first.
// The Java Queue interface is a subtype of the Java Collection interface.
import java.util.LinkedList;
import java.util.Queue;
public class Queue1 {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // add elements to queue using add() method
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        // print the queue
        System.out.println(q);
        // remove the head of the queue using remove() method
        System.out.println(q.remove());

        // print the queue
        System.out.println(q);

        // peek() method returns the head of the queue
        System.out.println(q.peek());

        // print the queue
        System.out.println(q);

        // poll() method removes and returns the head of the queue
        System.out.println(q.poll());

        // print the queue
        System.out.println(q);

        // element() method returns the head of the queue
        System.out.println(q.element());

        // print the queue
        System.out.println(q);

        // offer() method adds an element to the queue
        // offer() method returns true if the element is added successfully
        System.out.println(q.offer(60));
        
        // print the queue
        System.out.println(q);

        // size() method returns the number of elements in the queue
        System.out.println(q.size());

        // isEmpty() method returns true if the queue is empty
        System.out.println(q.isEmpty());

        // contains() method returns true if the queue contains the specified element
        System.out.println(q.contains(20));
        System.out.println(q.contains(70));

        // print the queue
        System.out.println(q);

        // clear() method removes all the elements from the queue
        q.clear();

        // print the queue
        System.out.println(q);
    }
    
}
