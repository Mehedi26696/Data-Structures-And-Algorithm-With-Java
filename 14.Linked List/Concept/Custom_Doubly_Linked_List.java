

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
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }


    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
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
            head.prev = newNode;
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
            current.next.prev = newNode;
            current.next = newNode;
            newNode.prev = current;
        }
        size++;
    }

    public void deletefisrt(){
        if(head == null){
            throw new IndexOutOfBoundsException("Index: 0, Size: 0");
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    public void deleteLast(){
        if(head == null){
            throw new IndexOutOfBoundsException("Index: 0, Size: 0");
        }
        tail = tail.prev;
        tail.next = null;
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
            current.next.prev = current;
            size--;
        }
    }

    public void display(){
        Node current = head;
        while(current.next != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println(current.data);
    }

    public void displayback(){
        Node current = tail;
        while(current.prev != null){
            System.out.print(current.data + "->");
            current = current.prev;
        }
        System.out.println(current.data);
    }
}




public class Custom_Doubly_Linked_List {

    public static void main(String[] args) {
        LL list = new LL();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        System.out.println("Forward Traversal");
        list.display();
        System.out.println("Backward Traversal");
        list.displayback();
        
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
//addAt() method: O(n)
//deleteFirst() method: O(1)
//deleteLast() method: O(1)
//deleteAt() method: O(n)
//display() method: O(n)
//displayback() method: O(n)

//Space Complexity: O(n) where n is the number of elements in the linked list.
