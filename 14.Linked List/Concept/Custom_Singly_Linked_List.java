
class LL{

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addAt(int index, int data){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node newNode = new Node(data);
        if(index == 0){
            addfirst(data);
        }else{
            Node current = head;
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    public void deletefisrt(){
        if(head == null){
            throw new IndexOutOfBoundsException("Index: 0, Size: 0");
        }
        head = head.next;
        size--;
    }

    public void deleteLast(){
        if(head == null){
            throw new IndexOutOfBoundsException("Index: 0, Size: 0");
        }
        Node current = head;
        for(int i = 0; i < size - 2; i++){
            current = current.next;
        }
        current.next = null;
        tail = current;
        size--;
    }

    public void deleteAt(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if(index == 0){
            deletefisrt();
        }else if(index == size - 1){
            deleteLast();
        }else{
            Node current = head;
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }
    }

    public void display(){
        Node current = head;
        while(current.next != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print(current.data);

       
    }
}

public class Custom_Singly_Linked_List {

    public static void main(String[] args) {
        LL ll = new LL();
        ll.add(1);
        ll.add(2);  
        ll.add(3);
        ll.add(4);
        ll.display();
        System.out.println();
        ll.addfirst(0);
        ll.display();

        System.out.println();
        ll.addAt(2, 5);
        ll.display();

        System.out.println();
        ll.deletefisrt();
        ll.display();

        System.out.println();
        ll.deleteLast();
        ll.display();

        System.out.println();

        ll.deleteAt(2);
        ll.display();


    }
}


// Time Complexity:
// add() - O(1)
// addFirst() - O(1)    
// addAt() - O(n)
// deleteFirst() - O(1)
// deleteLast() - O(n)
// deleteAt() - O(n)


// Space Complexity: O(1) for all operations