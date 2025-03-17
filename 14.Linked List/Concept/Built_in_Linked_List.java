

// Java only provides doubly Linked List as built-in linked list.
// Java does not provide singly linked list as built-in linked list.



import java.util.LinkedList;
public class Built_in_Linked_List {

    public static void main(String[] args) {
        // Creating object of built-in linked list
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements to the linked list

        // add() method is used to add elements at the end of the linked list
        list.add(10); 
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // Printing the linked list
        System.out.println(list);

        // Adding elements at the beginning of the linked list
        list.addFirst(5);
        System.out.println(list);

        // Adding elements at the end of the linked list
        list.addLast(60);
        System.out.println(list);

        // Adding elements at the specified index
        list.add(3, 35);    
        System.out.println(list);

        // Removing first element from the linked list
        list.removeFirst();
        System.out.println(list);

        // Removing last element from the linked list
        list.removeLast();
        System.out.println(list);

        // Removing element at the specified index
        list.remove(3);
        System.out.println(list); 
        

        list.remove(); // It will remove the first element from the linked list
        System.out.println(list);

        // Removing first occurrence of the specified element
        list.add(35);
        System.out.println(list);
        list.removeFirstOccurrence(35);
        System.out.println(list);

        // Removing last occurrence of the specified element
        list.add(35);
        System.out.println(list);
        list.removeLastOccurrence(35);
        System.out.println(list);

        // get() method is used to get the element at the specified index
        System.out.println(list.get(2));

        // set() method is used to set the element at the specified index
        list.set(2, 25);
        System.out.println(list);

        // getFirst() method is used to get the first element of the linked list
        System.out.println(list.getFirst());

        // getLast() method is used to get the last element of the linked list
        System.out.println(list.getLast());

        // size() method is used to get the size of the linked list
        System.out.println(list.size());

        // contains() method is used to check whether the specified element is present in the linked list or not
        System.out.println(list.contains(25));

        // indexOf() method is used to get the index of the first occurrence of the specified element
        System.out.println(list.indexOf(25));

        // lastIndexOf() method is used to get the index of the last occurrence of the specified element
        System.out.println(list.lastIndexOf(25));

        // clear() method is used to remove all the elements from the linked list
        list.clear();


    }
    
}


// Time Complexity of Built-in Linked List in Java:
// The time complexity of built-in linked list in Java is as follows:

// add() method: O(1)
// addFirst() method: O(1)
// addLast() method: O(1)
// add(index, element) method: O(n)
// removeFirst() method: O(1)
// removeLast() method: O(1)
// remove(index) method: O(n)
// remove() method: O(1)
// removeFirstOccurrence() method: O(n)
// removeLastOccurrence() method: O(n)
// get(index) method: O(n)
// set(index, element) method: O(n)
// getFirst() method: O(1)
// getLast() method: O(1)
// size() method: O(1)
// contains() method: O(n)
// indexOf() method: O(n)
// lastIndexOf() method: O(n)
// clear() method: O(n)

// The space complexity of built-in linked list in Java is O(n).
// The space complexity of built-in linked list in Java is O(n) because it uses an array internally to store the elements of the linked list.

