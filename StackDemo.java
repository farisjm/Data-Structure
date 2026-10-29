// Simple Stack implementation in Java using Array
// No library Stack class is used

class StackDemo {

    // Array to store stack elements
    int[] stack = new int[5];

    // Top points to the top element
    int top = -1;


    // -----------------------------------------
    // PUSH
    // -----------------------------------------

    void push(int data) {

        // Check whether stack is full
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        // Move top to the next position
        top++;

        // Store data at top
        stack[top] = data;
    }


    // -----------------------------------------
    // POP
    // -----------------------------------------

    void pop() {

        // Check whether stack is empty
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        // Display the element being removed
        System.out.println("Popped: " + stack[top]);

        // Move top one position down
        top--;
    }


    // -----------------------------------------
    // PEEK
    // -----------------------------------------

    void peek() {

        // Check whether stack is empty
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        // Display the top element
        System.out.println("Top element: " + stack[top]);
    }


    // -----------------------------------------
    // DISPLAY
    // -----------------------------------------

    void display() {

        // Check whether stack is empty
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack elements:");

        // Display from TOP to bottom
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }


    // -----------------------------------------
    // MAIN METHOD
    // -----------------------------------------

    public static void main(String[] args) {

        // Create Stack object
        StackDemo s = new StackDemo();

        // Push elements
        s.push(10);
        s.push(20);
        s.push(30);

        // Display stack
        System.out.println("After Push:");
        s.display();

        // Peek top element
        System.out.println("\nPeek:");
        s.peek();

        // Pop top element
        System.out.println("\nAfter Pop:");
        s.pop();

        // Display stack again
        s.display();
    }
}