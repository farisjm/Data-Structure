import java.util.Scanner;

class CircularQueue {
	int []queue;
	int front;
	int rear;
	int size;
	
	public CircularQueue(int size) {
		this.size = size;
		queue = new int[size];
		
		front = -1;
		rear = -1;
	}
	
	void enqueue(int data) {
		if((rear+1) % size == front){
			System.out.println("System is full");
			return;
		}
		if(front == -1) {
			front = 0;
			rear = 0;
		} else {
			rear = (rear + 1) % size;
		}
		queue[rear] = data;
		System.out.println(data + " data interted to the queue");
	}
	
	void dequeue() {
		if (front == -1) {
			System.out.println("System is empty");
			return;
		}
		int value = queue[front];
		
		if(front==rear){
			front = -1;
			rear = -1;
		} else {
			front = (front + 1) % size;
			System.out.println("Deleted from queue");
		}
	}
	
	void display() {
		if (front == -1) {
			System.out.println("System is empty");
			return;
		}
		System.out.println("Queue elements : ");
		int pos = front;
		while(true) {
			System.out.print(queue[pos] + " ");
			if(pos == rear) {
				break;
			}
			pos = (pos+1)%size;
		}
		System.out.println();
	}
	
	void peek() {
		if (front == -1) {
			System.out.println("System is empty");
			return;
		}
		System.out.println("Peek element is "+queue[front]);
	}
	
	public static void main(String[] args) {
		CircularQueue c1 = new CircularQueue(5);
		Scanner sc = new Scanner(System.in);
		int choice;
		int value;
		
		do {
			System.out.println("====== CircularQueue ======");
			System.out.println("1. Enqueue ");
			System.out.println("2. Dequeue ");
			System.out.println("3. Display");
			System.out.println("4. Peek");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice){
				case 1:
					System.out.print("Enter value: ");
					value = sc.nextInt();
					
					c1.enqueue(value);
					break;
					
				case 2:
					c1.dequeue();
					break;
					
				case 3:
					c1.display();
					break; 
					
				case 4:
					c1.peek();
					break;
					
				case 5:
					System.out.println("Program terminated. ");
					break;
					
				default:
					System.out.println("Invalid choice.");
					
				
			}
		}while(choice !=5);
		
			sc.close();
	}
}