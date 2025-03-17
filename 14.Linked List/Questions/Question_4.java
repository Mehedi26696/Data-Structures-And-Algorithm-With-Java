

// Write a program to merge two sorted linked lists into a single sorted linked list. 

// https://leetcode.com/problems/merge-two-sorted-lists/description/



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

    public static LL merge(LL list1, LL list2) {
        Node current1 = list1.head;
        Node current2 = list2.head;

        LL mergedList = new LL();

        while (current1 != null && current2 != null) {
            if (current1.data < current2.data) {
                mergedList.add(current1.data);
                current1 = current1.next;
            } else {
                mergedList.add(current2.data);
                current2 = current2.next;
            }  

        }

        while (current1 != null) {
            mergedList.add(current1.data);
            current1 = current1.next;
        }

        while (current2 != null) {
            mergedList.add(current2.data);
            current2 = current2.next;
        }

        return mergedList;
        
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

public class Question_4 {
    public static void main(String[] args) {

        LL list1 = new LL();
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        list1.add(4);
        list1.print();

        LL list2 = new LL();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(3);
        list2.add(3);
        list2.add(4);
        list2.print();

        LL mergedList = LL.merge(list1, list2);
        mergedList.print();


    }
}
