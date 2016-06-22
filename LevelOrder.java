import java.util.*;
class node{
	int data;
	node right;
	node left;
	node(int d){
		data =d;
		right = null;
		left = null;
	}
}
public class LevelOrder {
	static node root;
	
	
	public void printlevel(node root) {
		Queue<node> queue = new LinkedList<node>();
		queue.add(root);
		while(!queue.isEmpty()){
			node temp = queue.poll();
			System.out.println(temp.data);
			
			if(temp.left != null){
				queue.add(temp.left);
			}
			if(temp.right != null){
				queue.add(temp.right);
			}
		}
		
	}
	public static void main(String args[]) {
		LevelOrder tree = new LevelOrder();
		
		tree.root = new node(12);
		tree.root.left = new node(13);
		tree.root.right = new node(14);
		tree.root.left.left = new node(15);
		tree.root.left.right = new node(16);
		
		System.out.println("the level order traversal is");
		tree.printlevel(root);
	}
	
}

