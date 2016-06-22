class node {
	int data;
	node left;
	node right;
	node(int d){
		data = d;
		left  =null;
		right = null;
	}
}
class queue{
	int[] key;
	int size;
	int front;
	int rare;
	queue(int s){
		size = s;
		key = new int[size];
		front = 0;
		rare = -1;
	}
	public void enquue(int new_data ) {
		key[++rare] = new_data;
	}
	public int dequeue() {
		return key[front++];
	}
}
public class LevelOrder {
	static node root;
	public LevelOrder() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	public void printlevel(node root) {
		queue qu = new queue(500);
		qu.enquue(root.data);
		System.out.println(qu.dequeue());
		qu.enquue(root.left.data);
		qu.enquue(root.right.data);
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		
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

