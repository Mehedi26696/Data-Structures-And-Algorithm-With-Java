

// remove all occurrences of duplicate elements from the linked list

//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/submissions/1574806017/

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

    // remove all occurrences of duplicate elements from the linked list
    public void removeDuplicates() {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Node current = head;

        while (current != null) {
            boolean isDuplicate = false;
            while (current.next != null && current.data == current.next.data) {
                current = current.next;
                isDuplicate = true;
            }
            if (isDuplicate) {
                prev.next = current.next;
            } else {
                prev = prev.next;
            }
            current = current.next;
        }
        head = dummy.next;
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

public class Question_3 {

    public static void main(String[] args) {
        LL list = new LL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
        list.print();

        list.removeDuplicates();
        list.print();
         
    }
}
