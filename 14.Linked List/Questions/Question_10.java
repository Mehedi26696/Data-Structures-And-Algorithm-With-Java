// Sort a Linked List using Bubble Sort and Merge Sort

//https://leetcode.com/problems/sort-list/description/

// Time Complexity: O(nlogn) for Merge Sort and O(n^2) for Bubble Sort
// Space Complexity: O(1) for Bubble Sort and O(logn) for Merge Sort

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

    // Bubble Sort for Linked List
    public void bubblesort() {
        if (head == null || head.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    // Swap values
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    // Find the middle node (corrected)
    public Node findMiddle(Node head) {
        if (head == null || head.next == null) return head;
        Node slow = head, fast = head, prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // Disconnect the left half from the right half
        if (prev != null) prev.next = null;

        return slow;
    }

    // Merge two sorted linked lists
    public Node merge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;

        if (left.data <= right.data) {
            left.next = merge(left.next, right);
            return left;
        } else {
            right.next = merge(left, right.next);
            return right;
        }
    }

    // Merge Sort for Linked List
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) return head;

        Node middle = findMiddle(head);
        Node left = mergeSort(head);
        Node right = mergeSort(middle);

        return merge(left, right);
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

public class Question_10 {
    public static void main(String[] args) {
        LL list = new LL();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(10);

        System.out.println("Before Sorting:");
        list.print();

        // Using Bubble Sort
        // list.bubblesort();
        // System.out.println("After Bubble Sort:");
        // list.print();

        // Using Merge Sort
        list.head = list.mergeSort(list.head);
        System.out.println("After Merge Sort:");
        list.print();
    }
}
