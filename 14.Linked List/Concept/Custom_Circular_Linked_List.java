

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
        tail.next = head;
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
        tail.next = head;
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

    public void display(){
        if(head == null){
            return;
        }
        Node current = head;
        do{
            System.out.print(current.data + "->");
            current = current.next;
        }while(current.next!= head);
        System.out.println(current.data);
    }


    public void deletefisrt(){
        if(head == null){
            throw new IndexOutOfBoundsException("Index: 0, Size: 0");
        }
        head = head.next;
        tail.next = head;
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
        current.next = head;
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



}

public class Custom_Circular_Linked_List {


    public static void main(String[] args) {
        LL list = new LL();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.display();
        list.addfirst(5);
        list.display();
        list.addAt(3, 25);
        list.display();

        list.deletefisrt();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteAt(2);
        list.display();
        
    }
    
}


//Time Complexity: 
//add() method: O(1)
//addFirst() method: O(1)
//addLast() method: O(1)
//addAt() method: O(n)
//display() method: O(n)
//deleteFirst() method: O(1)
//deleteLast() method: O(n)
//deleteAt() method: O(n)
//Space Complexity: O(n) where n is the number of elements in the linked list.