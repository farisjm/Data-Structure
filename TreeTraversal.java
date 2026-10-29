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

public class TreeTraversal{

	static void preorder(Node root){
		if (root == null){
		return;
		}
		
		System.out.println(root.data+"");
		
		preorder(root.left)
	
	}

	static void inorder(Node root){
		if (root == null){
			return;
		}
		System.out.println(root.data+"");
		inorder(root.left);
	}
	
	static void postorder(Node root){
		if (root == null){
			return;
		}
		System.out.println(root.data+"");
		postorder(root.data);
	}
	
	public static void main(String args[]){
		
		Node root= new Node(10);
		
		root.left = new Node(20);
		root.right= new Node(30);
		
		root.left.left = new Node(40);
		root.left.right= new Node(50);
		
		System.out.println("Preorder:");
		preorder(root);
		
		System.out.println("\nInorder:");
		inorder(root);
		
		System.out.println("\nPostorder:");
		postorder(root);
	}
}