class node4{
	char data;
	node4 left, right;
	boolean rightThread;
	node4(char d){
		data = d;
		left = right = null;
	}
}
public class CreateBTree {
	static node4 root;
	static int preIndex = 0;
	public node4 makeTree(char[] in, char[] pre, int start, int end ) {
		if(start > end){
			return null ;
		}
		node4 new_node4 = new node4(pre[preIndex++]);
		if( start == end){
			return new_node4;
		}
		
		int elein = search(in, start, end, new_node4.data);
		
		new_node4.left = makeTree(in, pre, start, elein-1);
		new_node4.right = makeTree(in, pre, elein+1, end);
		return new_node4;
	}
	

	private int search(char[] in, int start, int end, char val) {
		int i;
		for(i = start ; i <= end ; i++){
			if(in[i] == val){
				return i;
			}
		}
		
		return i;	
	}
	public void printtree(node4 n) {
		
		if(n == null){
			return;
		}
		printtree(n.left);
		
		System.out.println(n.data + " ");
		
		printtree(n.right);
	}

	public static void main(String args[]) {
		
		CreateBTree tree = new CreateBTree();
		
		char in[] = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char pre[] = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
        
        int len = in.length;
        
        node4 mynode4 = tree.makeTree(in , pre, 0, len-1);
        System.out.println("the inoder of the tree is ");
        tree.printtree(mynode4);
	}
}
