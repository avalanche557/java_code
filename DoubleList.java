
public class DoubleList {
	node head;
	class node {
		int data;
		node next;
		node prev;
		node(int d){
			data = d;
			next = null;
			prev = null;
		}
	}
	public void push(int new_data) {
		node new_node = new node(new_data);
		
		new_node.next = head;
		new_node.prev = null;
		
		if(head != null){
			head.prev = new_node;
			
		}
		head = new_node;
	}
	public void append(int new_data) {
		node new_node = new node(new_data);
		
		if(head == null){
			new_node.prev = null;
			head = new_node;
			return;
		}
		node last = head;
		while(last.next != null){
			last = last.next;
		}
		last.next = new_node;
		new_node.prev = last;
	}
	public void after(node prev_node, int new_data) {
		node new_node = new node(new_data);
		
		if(prev_node == null)
			System.out.println("the node does not exits");
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		
		new_node.prev = prev_node;
		
		new_node.next.prev = new_node;
	} 
	public void printlist() {
		node n = head;
		while(n != null){
			System.out.println(n.data +" ");
			 n = n.next;
		}
	}
	public static void main(String args[]) {
		DoubleList list = new DoubleList();
		
		list.push(5);
		list.push(6);
		list.push(7);
		list.push(8);
		list.push(9);
		list.append(4);
		list.append(3);
		list.after(list.head.next, 10);
		System.out.println("the double linked list is");
		list.printlist();
	}
	
}
