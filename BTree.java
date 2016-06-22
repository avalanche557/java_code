class node {
		int data;
		node right;
		node left;
		node(int d){
			data =d;
			left = null;
			right = null;
		}
	}
public class BTree {
	node root;
	public static void main(String args[]) {
		BTree tree = new BTree();
		
		tree.root=  new node(10);
		tree.root.left = new node(11);
		tree.root.right = new node(12);
		
		
		
		
	}
 
}
