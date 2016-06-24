class node6{
	int data;
	node6 right;
	node6 left;
	node6(int d){
		data = d;
		left = right = null;
	}
}
public class maxWidth2 {
	static node6 root;
	
	public static void main(String args[]) {
		maxWidth2 tree = new maxWidth2();
		
		tree.root = new node6(1);
        tree.root.left = new node6(2);
        tree.root.right = new node6(3);
        tree.root.left.left = new node6(4);
        tree.root.left.right = new node6(5);
        tree.root.right.right = new node6(8);
        tree.root.right.right.left = new node6(6);
        tree.root.right.right.right = new node6(7);
		
		System.out.println("the max width of the tree is" + tree.max(root));
	}
	
	public int  max(node6 root) {
		int h = height(root);
		int i =0;
		int maxWidth = 0;
		for(i =0 ; i < h ; i++){
			int Width = getwidth(root, i);
			if(Width > maxWidth){
				maxWidth  = Width;
			}
		}
		return maxWidth;
	}
	private int getwidth(node6 root2, int i) {
		// TODO Auto-generated method st
		if(root2 == null){
			return 0;
		}
		if(i == 1){
			return 1;
		}
		else if(i > 1){
			return getwidth(root2.left, i-1)+getwidth(root2.right, i-1);
		}
		return 0;
	}

	public int height(node6 root2) {
		if (root2 == null){
			return 0;
		}
		int lheight= height(root2.left);
		int rheight = height(root2.right);
		
		return (1+ Math.max(lheight, rheight));
	}
}
