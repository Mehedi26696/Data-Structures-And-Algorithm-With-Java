

// Implement Stack using Linked List


class Stack{

    private Node head;
    private Node tail;
    private int size;

    public Stack(){
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

    public void push(int data){
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

    public int pop(){
        if(head == null){
            throw new IndexOutOfBoundsException("Index: 0, Size: 0");
        }
        Node current = head;
        Node previous = null;
        for(int i = 0; i < size - 1; i++){
            previous = current;
            current = current.next;
        }
        if(size == 1){
            head = null;
            tail = null;
        }else{
            previous.next = null;
            tail = previous;
        }
        size--;
        return current.data;
    }

    public int peek(){
        if(head == null){
            throw new IndexOutOfBoundsException("Index: 0, Size: 0");
        }
        Node current = head;
        for(int i = 0; i < size - 1; i++){
            current = current.next;
        }
        return current.data;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}

public class Stack2{
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        // top element of stack
        System.out.println("Top element is: " + stack.peek());

        // pop element from stack means remove top element of stack
        System.out.println("Pop element is: " + stack.pop());
        

        // top element of stack
        System.out.println("Top element is: " + stack.peek());

        // size of stack
        System.out.println("Size of stack is: " +  stack.size());

        // check stack is empty or not
        System.out.println("Stack is empty: " + stack.isEmpty());
      
    }
} 
 