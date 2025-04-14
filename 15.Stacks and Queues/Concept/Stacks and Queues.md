# Stacks and Queues in Java

## Stack
A **Stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle. The element added last is removed first.

### Key Operations
1. **push(element)**: Adds an element to the top of the stack.
2. **pop()**: Removes and returns the top element of the stack.
3. **peek()**: Returns the top element without removing it.
4. **isEmpty()**: Checks if the stack is empty.
5. **size()**: Returns the number of elements in the stack.

### Implementation in Java
Java provides the `Stack` class in the `java.util` package.

```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements
        System.out.println("Popped: " + stack.pop());

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
```

### Use Cases
- Undo functionality in text editors.
- Backtracking algorithms (e.g., maze solving, DFS).
- Expression evaluation and conversion (e.g., infix to postfix).

---

## Queue
A **Queue** is a linear data structure that follows the **FIFO (First In, First Out)** principle. The element added first is removed first.

### Key Operations
1. **add(element)** or **offer(element)**: Adds an element to the rear of the queue.
2. **remove()** or **poll()**: Removes and returns the front element.
3. **peek()**: Returns the front element without removing it.
4. **isEmpty()**: Checks if the queue is empty.
5. **size()**: Returns the number of elements in the queue.

### Implementation in Java
Java provides the `Queue` interface, which is implemented by classes like `LinkedList` and `PriorityQueue`.

```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Add elements
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Peek front element
        System.out.println("Front element: " + queue.peek());

        // Remove elements
        System.out.println("Removed: " + queue.poll());

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
```

### Use Cases
- Task scheduling (e.g., CPU scheduling).
- Breadth-First Search (BFS) in graphs.
- Handling requests in web servers.

---

## Deque
A **Deque (Double-Ended Queue)** is a linear data structure that allows insertion and deletion of elements from both ends (front and rear).

### Key Operations
1. **addFirst(element)**: Adds an element to the front of the deque.
2. **addLast(element)**: Adds an element to the rear of the deque.
3. **removeFirst()**: Removes and returns the front element.
4. **removeLast()**: Removes and returns the rear element.
5. **peekFirst()**: Returns the front element without removing it.
6. **peekLast()**: Returns the rear element without removing it.
7. **isEmpty()**: Checks if the deque is empty.
8. **size()**: Returns the number of elements in the deque.

### Implementation in Java
Java provides the `Deque` interface, which is implemented by classes like `LinkedList` and `ArrayDeque`.

```java
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        // Add elements to both ends
        deque.addFirst(10);
        deque.addLast(20);

        // Peek elements
        System.out.println("Front element: " + deque.peekFirst());
        System.out.println("Rear element: " + deque.peekLast());

        // Remove elements from both ends
        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from rear: " + deque.removeLast());

        // Check if deque is empty
        System.out.println("Is deque empty? " + deque.isEmpty());
    }
}
```

### Use Cases
- Palindrome checking.
- Sliding window problems.
- Implementing stacks and queues.

---

## Differences Between Stack, Queue, and Deque

| Feature         | Stack                  | Queue                  | Deque                     |
|------------------|------------------------|------------------------|---------------------------|
| Principle        | LIFO (Last In, First Out) | FIFO (First In, First Out) | Both ends (Insert/Delete) |
| Operations       | push, pop, peek        | add, remove, peek      | addFirst, addLast, peek   |
| Implementation   | `Stack` class          | `Queue` interface      | `Deque` interface         |
| Use Cases        | Backtracking, parsing  | Scheduling, BFS        | Palindrome, sliding window |
