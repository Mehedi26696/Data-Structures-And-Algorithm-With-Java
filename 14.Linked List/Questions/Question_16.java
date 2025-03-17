
//Rotate a Linked List

//https://leetcode.com/problems/rotate-list/description/

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

    // Rotate k nodes of the Linked List

    public Node rotate(Node head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        // Calculate the size of the list
        int size = 1;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
            size++;
        }

        // Adjust k in case it is larger than size
        k = k % size;
        if (k == 0)
            return head;

        // Find the new tail (size - k - 1)th node
        Node newTail = head;
        for (int i = 0; i < size - k - 1; i++) {
            newTail = newTail.next;
        }

        // New head is the next node of newTail
        Node newHead = newTail.next;
        newTail.next = null; // Break the link
        tail.next = head; // Connect old tail to old head
        return newHead;
    }

    // Print the Linked List
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Question_16 {

    public static void main(String[] args) {

        LL list = new LL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original Linked List: ");
        list.print();

        list.head = list.rotate(list.head, 2);

        System.out.println("Rotated Linked List: ");
        list.print();

    }

}
