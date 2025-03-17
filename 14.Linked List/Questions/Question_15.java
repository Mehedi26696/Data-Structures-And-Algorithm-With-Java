

// Reverse K groups of nodes in a linked list


//https://leetcode.com/problems/reverse-nodes-in-k-group/description/



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

    public Node reversekgroups(int k) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            if (count % k == 0) {
                prev = reverse(prev, curr.next);
                curr = prev.next;
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
        
    }

    public Node reverse(Node start, Node end) {
        Node prev = start;
        Node curr = start.next;
        Node first = curr;
        Node next = null;
        while (curr != end) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        start.next = prev;
        first.next = curr;
        return first;
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


public class Question_15 {

    public static void main(String[] args) {
        LL list = new LL();
        list.add(1);
        list.add(2);
        list.add(3);    
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        list.print();

        list.head = list.reversekgroups(2);
        list.print();


    }
    
}
