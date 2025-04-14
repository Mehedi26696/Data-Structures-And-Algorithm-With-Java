
// Implement Queue using Stacks

// Time Complexity: O(1) for push and O(n) for pop
// Space Complexity: O(n) for push and O(1) for pop

// https://leetcode.com/problems/implement-queue-using-stacks/description/

import java.util.Stack;

class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

public class Question1 {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);

        
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
} 