class node{
	int data;
	node right;
	node left;
	node(int d){
		data = d;
		right = left  = null;
	}
}
public class BST {
	static node root;
	public static void main(String args[]) {
		
		BST tree = new BST();
		
		tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        tree.inoder(root);
	}
	public void insert(int data) {
		root = insertRec(data, root);
	}
	public node insertRec(int data, node root) {
		
		if(root == null){
			root = new node(data);
			return root;
		}
		if(data < root.data){
			root.left = insertRec(data, root.left);
		}
		else if(data > root.data){
			root.right = insertRec(data, root.right);
		}
		return root;
	}
	public void inoder(node root) {
		if(root == null){
			return;
		}
		inoder(root.left);
		System.out.println(root.data +" ");
		inoder(root.right);
	}
}
