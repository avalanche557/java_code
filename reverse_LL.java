
public class reverse_LL {
	static node head;
	
	class node{
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
		
		while(n != null){
			System.out.println(n.data +" ");
			n =n.next;
		}
	}
	node reverse(node n) {
		node current = n;
		node prev = null;
		node next = null;
		
		while(current != null){
			next= current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		n = prev;
		return n;
	}
	public static void main(String[] args) {
		reverse_LL list = new reverse_LL();
		
		list.push(5);
		list.push(6);
		list.push(7);
		list.push(9);
		
		System.out.println("the linked list is is");
		list.printlist();
		head = list.reverse(head);
		System.out.println("linked list after the reversal is");
		list.printlist();
	}
}
