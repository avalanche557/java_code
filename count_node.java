
public class count_node {
	node head;
	private int count = 0;
	class node {
		int data;
		node next;
		node(int d){
			data = d;
			next = null;
		}
	}
	public void push(int new_data) {
		node new_node = new node(new_data);
		
		new_node.next = head;
		head = new_node;
	}
	
	public void printlist() {
		node n = head;
		while (n != null){
			count++;
			System.out.println(n.data +" ");
			n =n.next;
		}
		System.out.printf("no. of node is %d", count);
	}
	public static void main(String[] args){
		count_node list = new count_node();
		
		list.push(6);
		list.push(7);
		list.push(8);
		list.push(9);
		list.push(10);
		
		System.out.println("the linked list is");
		list.printlist();
		
		
	}
}
