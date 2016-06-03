
public class linkedlist_final {
	node head;
	
	class node{
		int data;
		node next;
		node(int d){
			data = d;
			next = null;
		}
	}
	public void append(int new_data) {
		if(head == null){
			head = new node(new_data);
		}
		node new_node = new node(new_data);
		new_node.next = null;
		
		node last = head;
		
		while(last.next != null)
			last= last.next;
		
		last.next = new_node;
	}
	public void push(int new_data) {
		node new_node = new node(new_data);
		
		new_node.next = head;
		head = new_node;
	}
	public void atpos(node prev, int new_data) {
		if(prev == null){
			System.out.println("the prev_node does not exist");
		}
		node new_node = new node(new_data);
		
		new_node.next = prev.next;
		prev.next = new_node;
	}
	
	public void printlist() {
		node n = head;
		while(n != null){
			System.out.println(n.data +" ");
			n = n.next;
		}
	}
	public static void main(String[] args){
		linkedlist_final list = new linkedlist_final();
		
		list.append(5);
		//5->null
		list.push(6);
		//6->5->null
		list.push(9);
		//9->6->5->null
		list.push(10);
		list.append(12);
		//10->9->6->5->null
		list.atpos(list.head.next, 11);
		//10->9->6->11->5->null

		
		System.out.println("the linked list is");
		list.printlist();
	}
	

}
