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
	
	public void print() {
		node n = root;
		while(n.left != null && n.right == null){
			System.out.println(n.data +" ");
			n = n.left;
			n= n.right;
		}
	}
	public static void main(String args[]) {
		BTree tree = new BTree();
		
		tree.root=  new node(10);
		tree.root.left = new node(11);
		tree.root.right = new node(12);
		tree.print();
		
		
		
		
	}
 
}
