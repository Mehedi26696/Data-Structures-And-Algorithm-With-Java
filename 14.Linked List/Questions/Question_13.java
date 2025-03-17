

//Palindrome Linked List Check

// https://leetcode.com/problems/palindrome-linked-list/description/



import java.util.Stack;

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
    

    // Palindrome Linked List Check with stack

    public boolean Check(){
        Node current = head;
        Node temp = head;
        Stack<Integer> stack = new Stack<Integer>();
        while(current != null){
            stack.push(current.data);
            current = current.next;
        }
        while(temp != null){
            if(temp.data != stack.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }


   // Palindrome Linked List Check without stack
    public Node middleNode( Node head) {
        Node s = head;
        Node f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public Node reverseList(Node head) {
        if (head == null) {
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public boolean isPalindrome(Node head) {
        Node mid = middleNode(head);
        Node headSecond = reverseList(mid);
        Node rereverseHead = headSecond;

        // compare both the halves
        while (head != null && headSecond != null) {
            if (head.data != headSecond.data) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);

        return head == null || headSecond == null;
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



public class Question_13 {

    public static void main(String[] args) {
        LL ll = new LL();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(2);
        ll.add(1);
        ll.print();
        System.out.println(ll.Check());
        System.out.println(ll.isPalindrome(ll.head));
        ll.print();
    
    }
    
}
