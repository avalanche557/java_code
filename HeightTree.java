 class node {
	 int data;
	 node left;
	 node right;
	 node(int d){
		 data = d;
		 left = right = null;
	 }
 }
public class HeightTree {
	static node root;
	public static void main(String args[]) {
		HeightTree tree = new HeightTree();
		
		tree.root = new node(12);
		tree.root.left = new node(13);
		tree.root.right = new node(14);
		tree.root.left.left = new node(15);
		tree.root.left.left.right = new node(15);
		tree.root.left.right = new node(16);
		
		int val = tree.maxdepth(root);
		System.out.println("the height of the tree is " + val);
	}
	private int maxdepth(node root) {
		// TODO Auto-generated method stub
		if(root  == null)
			return 0;
		
		int lheight = height(root.left);
		int rheight = height(root.right);
		
		return (1+ Math.max(lheight, rheight));
	}
	public int height(node root) {
		// TODO Auto-generated method stub
		if(root == null){
			return 0;
		}
		return (1+Math.max(height(root.left), height(root.right)));
	}
}
