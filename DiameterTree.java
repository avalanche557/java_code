class node{
	int data;
	node right;
	node left;
	node(int d){
		data = d;
		left = null;
		right = null;
	}
}
public class DiameterTree {
	static node root;
	public int dia(node root) {
		if(root == null){
			return 0;
		}
		int lheight = height(root.left);
		int rheight = height(root.right);
		
		int ldia = dia(root.left);
		int rdia = dia(root.right);
		
		return (1 + Math.max(lheight+rheight, Math.max(ldia, rdia)));
	}
	public int height(node root) {
		if(root == null){
			return 0;
		}
		return (1+ Math.max(height(root.left), height(root.right)));
	}
	
	public static void main(String args[]) {
		DiameterTree tree = new DiameterTree();
		
		tree.root = new node(12);
		tree.root.left = new node(13);
		tree.root.right = new node(14);
		tree.root.left.left = new node(15);
		tree.root.left.right = new node(16);
		
		System.out.println("the diameter of the tree is" +tree.dia(root));
	}
}
