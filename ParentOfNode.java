class node{
	int data;
	node left;
	node right;
	node(int d){
		data = d;
		left = right = null;
	}
}
public class ParentOfNode {
	static node root;
	
	public static void main(String args[]) {
		ParentOfNode tree = new ParentOfNode();
		
		tree.root = new node(12);
		tree.root.left = new node(13);
		tree.root.right = new node(14);
		tree.root.left.left = new node(15);
		tree.root.left.left.right = new node(17);
		tree.root.left.right = new node(16);
		
		tree.printparent(root,17);
	}

	private boolean printparent(node root2, int target) {
		// TODO Auto-generated method stub
		if (root2 == null){
			return false;
		}
		
		if(root2.data == target){
			return true;
		}
		if(printparent(root2.left, target) || printparent(root2.right, target)){
			System.out.println(root2.data +" ");
			return true;
		}
		return false;
		
	}
}
