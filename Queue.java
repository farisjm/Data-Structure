// Queue implementation using an array
// No built-in Queue library is used

class Queue {

    // Array used to store queue elements
    int[] queue;

    // Maximum size of the queue
    int size;

    // Points to the first element of the queue
    int front;

    // Points to the last element of the queue
    int rear;

    // Constructor to create the queue
    Queue(int size) {

        // Store the maximum size
        this.size = size;

        // Create an integer array
        queue = new int[size];

        // Initially, the queue is empty
        front = -1;

        // Initially, the queue is empty
        rear = -1;
    }

    // Method to insert an element into the queue
    void enqueue(int value) {

        // Check whether the queue is full
        if (rear == size - 1) {

            System.out.println("Queue is Full");
            return;
        }

        // If this is the first element
        if (front == -1) {
            front = 0;
        }

        // Move rear to the next position
        rear++;

        // Store the value at the rear position
        queue[rear] = value;

        System.out.println(value + " inserted into queue");
    }

    // Method to remove an element from the queue
    void dequeue() {

        // Check whether the queue is empty
        if (front == -1 || front > rear) {

            System.out.println("Queue is Empty");
            return;
        }

        // Store the element that will be removed
        int value = queue[front];

        // Move front to the next position
        front++;

        System.out.println(value + " removed from queue");

        // If all elements have been removed
        if (front > rear) {

            // Reset the queue
            front = -1;
            rear = -1;
        }
    }

    // Method to display the queue
    void display() {

        // Check whether the queue is empty
        if (front == -1) {

            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Queue elements:");

        // Traverse from front to rear
        for (int i = front; i <= rear; i++) {

            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        // Create a queue with maximum size 5
        Queue q = new Queue(5);

        // Insert elements
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        // Display queue
        q.display();

        // Remove the first element
        q.dequeue();

        // Display queue again
        q.display();

        // Insert another element
        q.enqueue(50);

        // Display queue
        q.display();

        // Try to remove elements
        q.dequeue();
        q.dequeue();

        // Display final queue
        q.display();
    }
}