import java.util.Scanner;

class node{
	int data;
	node right;
	node left;
	node(int d){
		data = d;
		right = left  = null;
	}
}
public class KdistanceNode {
	static node root;
	
	public static void main(String args[]) {
		
		KdistanceNode tree = new KdistanceNode();
		
		tree.root = new node(12);
		tree.root.left = new node(13);
		tree.root.right = new node(14);
		tree.root.left.left = new node(15);
		tree.root.left.left.right = new node(15);
		tree.root.left.right = new node(16);
		
		System.out.println("Enter the value of k" );
		int k = new Scanner(System.in).nextInt();
		
		tree.distance(root, k);
	}
	
	public void distance(node root, int k) {
		if(root == null){
			return;
		}
		if(k == 0){
			System.out.println(root.data +" ");
			return;
		}
		else {
			distance(root.left, k-1);
			distance(root.right, k-1);
		}
	}
}
