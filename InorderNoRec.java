import java.util.Stack;
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
public class InorderNoRec {
	static node root;
	public void Inorder(node root) {
		Stack<node> stack = new Stack<node>(); 
		if(root == null){
			return;
		}
		node n = root;
		while(n != null){
			stack.push(n);
			n = n.left;
		}
		while(stack.size() > 0){
			n = stack.pop();
			System.out.println(n.data +" ");
			if(n.right != null){
				n = n.right;
				
				while(n != null){
					stack.push(n);
					n = n.left;
					
				}
			}
		}
	}
	
	public static void main(String args[]) {
		InorderNoRec tree = new InorderNoRec();
		
		tree.root = new node(12);
		tree.root.left = new node(13);
		tree.root.right = new node(14);
		tree.root.left.left = new node(15);
		tree.root.left.right = new node(16);
		
		System.out.println("the Inorder traversal are");
		tree.Inorder(root);
		
	}
}
