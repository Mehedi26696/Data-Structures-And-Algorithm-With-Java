

// Stack is a subclass of Vector that implements a standard last-in, first-out stack.
// Stack only defines the default constructor, which creates an empty stack.
// Stack includes all the methods defined by Vector, and adds several of its own.

// Stack class is a part of Java Collection framework. It is a class that represents a last-in, first out (LIFO) stack of objects. It extends class Vector with five operations 
// that allow a vector to be treated as a stack. The usual push and pop operations are provided, as well as a method to peek at the top item on the stack, a method to test for 
// whether the stack is empty, and a method to search the stack for an item and discover how far it is from the top.

import java.util.Stack;

public class Stack1{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        
        // top element of stack
        System.out.println("Top element is: " + st.peek());

        // pop element from stack means remove top element of stack
        System.out.println( "Pop element is: " + st.pop());

        // top element of stack
        System.out.println( "Top element is: " + st.peek());

        // size of stack
        System.out.println( "Size of stack is: " + st.size());

        // check stack is empty or not
        System.out.println( "Stack is empty: " + st.isEmpty());
        


    }
}