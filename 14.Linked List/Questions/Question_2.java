

// Remove duplicates from a sorted linked list
// Given a sorted linked list, delete all duplicates such that each element appear only once.

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

class LL {
    private Node head;

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
    
    
    // remove duplicates from a sorted linked list
    public void removeDuplicates() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
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


public class Question_2 {

    public static void main(String[] args) {
        LL ll = new LL();
        ll.add(1);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(3);
        ll.add(4);
        ll.print();
        ll.removeDuplicates();
        ll.print();
        
    }
}

