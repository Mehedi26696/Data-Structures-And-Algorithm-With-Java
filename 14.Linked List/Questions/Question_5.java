
// Detect cycle in a linked list 

//https://leetcode.com/problems/linked-list-cycle/description/

// Time complexity: O(n)

// Space complexity: O(1)

// Approach: Floyd's cycle detection algorithm


class LL {
    Node head;

   
    public LL() {
        head = null;

    }

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    // detect cycle in a linked list
    public boolean hasCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    
    // print the linked list

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Question_5 {

    public static void main(String[] args) {
        
        LL list = new LL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        // create a cycle
        list.head.next.next.next.next.next = list.head.next.next;
        
        System.out.println(list.hasCycle());
    }
    
}
