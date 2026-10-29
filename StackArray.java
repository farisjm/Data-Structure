//class for implementing stack
class Stack{
	//Array used to store the empty stack
	int[] stack;
	//store the index of the top element
	int top;
	//store the maximum size of stack
	int capacity;
	
	
	Stack(int size){
		//store the maximum size
		capacity=size;
		//create an integer array of the given size
		stack = new int[capacity];
		//initially the stack is empty
		//therefor top is set to -1
		top=-1;
	}
	
	boolean isEmpty(){
		return top == -1;
	}
	
	boolean isFull(){
		return top == capacity-1;
	}
	
	void push(int value){
		
		if(isFull()){
			System.out.println("Stack is overflow!");
			return;
		}
		
		top++;
		
		stack[top]=value;
		System.out.println(value+" pushed into the stack");
	}
	
	int pop(){
		
		if(isEmpty()){
			System.out.println("Stack is unterflow!");
			return-1;
		}
		
		int value = stack[top];
		top--;
		System.out.println(value+" poped into the stack");
		return value;
	}
	
	int peek(){
		
		if(isEmpty()){
			System.out.println("Stack is empty.");
			return-1;
		}
		return stack[top];
	}
	
	void display(){
		
		if(isEmpty()){
			System.out.println("Stack is empty.");
			return;
		}
		
		System.out.println("Stack elements:");
		//start from top and move
		for(int i=top;i>=0;i--){
			//display each element
			System.out.println(stack[i]);
		}
	}
	
	void search(int value){
		
		
		if(isEmpty()){
			System.out.println("Stack is empty.");
			return;
		}
		
		boolean found=false;
		
		for(int i=top;i>=0;i--){
			
			if(stack[i]==value){
				System.out.println(value+" found at stack position "+(i+1));
				found=true;
				break;
			}
		}
		
		if(!found){
			System.out.println(value+"value not found in stack");
		}
	}
	
	int size(){
		return top+1;
	}
	
}

public class StackArray{
	public static void main(String args[]){
		Stack s=new Stack(5);
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		s.display();
		
		System.out.println("Top Element:"+s.peek());
		System.out.println("Stack Size:"+s.size());
		
		s.search(20);
		
		int removed=s.pop();
		System.out.println("Poped Elemend "+removed);
		s.display();
		
		System.out.println("Top Element:"+s.peek());
		System.out.println("Stack Size:"+s.size());
		
	}
}