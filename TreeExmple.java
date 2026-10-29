class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data=data;
		left=null;
		right=null;

	}
	
}

public class TreeExmple{
	public static void main(String args[]){
		
		Node root= new Node(10);
		
		root.left = new Node(20);
		root.right= new Node(30);
		
		root.left.left = new Node(40);
		root.left.right= new Node(50);
		
		System.out.println("        Root: " + root.data);
        System.out.println("          |");
        System.out.println("       |     |");
        System.out.println("       |     |");
        System.out.println(" Left: " + root.left.data +
                           "   Right: " + root.right.data);
        System.out.println("       |");
        System.out.println("    |     |");
        System.out.println("   " + root.left.left.data +
                           "      " + root.left.right.data);
		
	}

}