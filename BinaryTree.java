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
public class BinaryTree{
	public static void main(String args[]){
		Node root =new Node(70);
		
		root.left = new Node(15);
		root.right= new Node(82);
		
		root.left.left = new Node(7);
		root.left.right= new Node(17);
		
		root.right.right= new Node(61);
		root.right.right.right= new Node(15);
		
		System.out.println("Root Node is: " + root.data);
		System.out.println("Left child is: "+root.left.data);
		System.out.println("Right child is: "+root.right.data);
		System.out.println("Left child left siblise is: "+root.left.left.data);
		System.out.println("Left child right siblise is: "+root.left.right.data);
        System.out.println("Right child right siblise is: "+root.right.right.data);
		System.out.println("Right child Right child right siblise is: "+root.right.right.right.data);
	}
}