class node5{
	int data;
	node5 right;
	node5 left;
	node5(int d){
		data =d;
		right = left = null;
	}
}
public class MaxWidth {
	static node5 root;
	public static void main(String args[]) {
		MaxWidth tree = new MaxWidth();
		
		tree.root = new node5(1);
        tree.root.left = new node5(2);
        tree.root.right = new node5(3);
        tree.root.left.left = new node5(4);
        tree.root.left.right = new node5(5);
        tree.root.right.right = new node5(8);
        tree.root.right.right.left = new node5(6);
        tree.root.right.right.right = new node5(7);
		
		System.out.println("the max width of the tree is" + tree.max(root));
		
	}
	public int max(node5 root2) {
		int h = height(root2);
		int[] count = new int[h];
		
		int level = 0;
		
		getmaxwidth(root2, count, level);
		
		return getmax(count, h);
		
	}
	private int getmax(int[] count, int h) {
		// TODO Auto-generated method stub
		int max = count[0];
        int i;
        for (i = 0; i < h; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }
        return max;
	}
	public void getmaxwidth(node5 root2, int[] count, int level) {
		if(root2  == null){
			return;
		}
		count[level]++;
		getmaxwidth(root2.left, count, level+1);
		getmaxwidth(root2.right, count, level +1);
	}
	public int height(node5 root2) {
		if(root2 == null){
			return 0;
		}
		int lheight = height(root2.left);
		int rheight = height(root2.right);
		
		return (1+Math.max(lheight, rheight));
	}
}
