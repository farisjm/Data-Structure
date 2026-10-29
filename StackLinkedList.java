class Node{
	int data;
	Node next;
	
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
	
	
}

class Stack{
	Node top;
	
	Stack(){
		top= null;
		
	}
	void push(int data){
		Node newNode = new Node(data);
		
		newNode.next = top;
		
		top=newNode;
		
		System.out.println(data+" pushed into stack ");
	}
	
	void pop(){
		if(top == null){
			System.out.println("Stack Underflow - Stack is empty");
			return;
		}
		int value =top.data;
		top = top.next;
		System.out.println(value+" poped from stack");
	}
	
	void peek(){
		if(top == null){
			System.out.println("Stack is empty");
			return;
		}
		System.out.println(" Stack peek element= "+ top.data);
	}	
	
	void display(){
		if (top == null){
			System.out.println("Stack is empty");
			return;
		}
		
		Node current = top;
		System.out.println("Stack elements: ");
			
		while(current != null){
			System.out.println(current.data);
			current = current.next;
			
		}
	}
	
	boolean isEmpty(){
		
		return top == null ;
	}
}

public class StackLinkedList{
	
	public static void main(String[] args){
		
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.pop();
		stack.display();
		stack.peek();
		
		System.out.println("Is stack empty? "+stack.isEmpty());
	}
}