

//Reverse the Linked List in a range

//https://leetcode.com/problems/reverse-linked-list-ii/description/


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

    //Reverse the Linked List in a range

    public void reverse(int start, int end) {
        if (start == end) {
            return;
        }
        Node prev = null;
        Node current = head;
        int i = 0;
        while (current != null && i < start - 1) {
            prev = current;
            current = current.next;
            i++;
        }
        Node startNode = prev;
        Node endNode = current;
        Node next = null;
        i = 0;
        while (current != null && i < end - start + 1) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            i++;
        }
        if (startNode != null) {
            startNode.next = prev;
        } else {
            head = prev;
        }
        endNode.next = current;
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


public class Question_12 {

    public static void main(String[] args) {
        LL ll = new LL();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.add(10);
        ll.print();
        ll.reverse(2, 6);
        ll.print();
    }
    
}
