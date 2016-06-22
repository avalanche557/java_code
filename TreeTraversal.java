class node1{
	int data;
	node1 right;
	node1 left;
	node1(int d){
		data = d;
		right = null;
		left = null;
	}
}
public class TreeTraversal {
	static node1 root;
	public void printInOrder(node1 root) {
		if(root == null){
			return;
		}
		printInOrder(root.left);
		
		System.out.println(root.data+" ");
		
		printInOrder(root.right);
		
	}
	public void printpreorder(node1 root) {
		if(root == null){
			return;
		}
		System.out.println(root.data +" ");
		
		printInOrder(root.left);
		
		printInOrder(root.left);
	}
	public void printpostorder(node1 root) {
		if(root == null){
			return;
		}
		printpostorder(root.left);
		
		printpostorder(root.right);
		
		System.out.println(root.data +" ");
	}
	
	public TreeTraversal() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	public static void main(String args[]) {
		TreeTraversal tree = new TreeTraversal();
		
		TreeTraversal.root = new node1(10);
		TreeTraversal.root.left = new node1(11);
		TreeTraversal.root.right= new node1(12);
		TreeTraversal.root.left.left = new node1(13);
		TreeTraversal.root.left.right = new node1(14);
		TreeTraversal.root.right.left = new node1(15);
		TreeTraversal.root.right.right = new node1(16);
		
		System.out.println("the in order traversal is");
		tree.printInOrder(root);
		
		System.out.println("the pre order traversal is");
		tree.printpreorder(root);
		
		System.out.println("the post order traversal is");
		tree.printpostorder(root);
	}
}
