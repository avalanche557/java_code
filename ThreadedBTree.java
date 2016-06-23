class node{
	int data;
	node left, right;
	boolean rightThread;
	node(int d){
		data = d;
		left = right = null;
		rightThread = true;
	}
}
public class ThreadedBTree {
	static node root;
	node leftmost(node leftroot) {
			while(leftroot.left != null){
				leftroot = leftroot.left;
			}
			return leftroot;
		
	}
	void inOrder(node root) {
		if(root == null)
			return;
		
		node cur = leftmost(root);
		while(cur != null){
			System.out.println(cur.data +" ");
			
			if(cur.rightThread == true){
				cur = cur.right;
			}
			else {
				cur = leftmost(cur.right);
			}
		}
	}
	public static void main(String args[]) {
		ThreadedBTree tree = new ThreadedBTree();
		
		tree.root = new node(12);
		tree.root.left = new node(13);
		tree.root.right = new node(14);
		tree.root.left.left = new node(15);
		tree.root.left.right = new node(16);
		
		System.out.println("the inorder traversal is");
		tree.inOrder(root);
	}
}
