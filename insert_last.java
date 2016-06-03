public class insert_last {
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
		node new_node = new node(new_data);
		if (head == null){
			head = new node(new_data);
			return;
		}
		new_node.next = null;
		node last = head;
		while(last.next != null) 
			last= last.next;
			last.next = new_node;
			return;
	}
	
	public void printlist() {
		node n = head;
		while(n != null){
			System.out.println(n.data);
			n =n.next;
		}
	} 
	public static void main(String[] args) {
		insert_last list = new insert_last();
		
		list.append(5);
		list.append(6);
		list.append(7);
		
		System.out.println("the linked list is");
		
		list.printlist();
	}
}
