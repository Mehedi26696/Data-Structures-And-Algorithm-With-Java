
// Recursively insert a node in a linked list

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

    // recursive insert in a specific position
    public void insertRec(int data, int position) {
        head = insertRec(head, data, position);
    }

    private Node insertRec(Node node, int data, int position) {
         if(position == 0){
            Node newNode = new Node(data);
            newNode.next = node;
            return newNode;
         }
        node.next = insertRec(node.next, data, position - 1);
        return node;
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

public class Question_1 {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print();
        ll.insertRec(10, 3);
        ll.print();
    }
}