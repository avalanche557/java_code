
public class ReverseDouble {
	static node head = null;
	class node{
		int data;
		node next;
		node prev;
		node (int d){
			data = d;
			next = null;
			prev = null;
		}
	}
	public void push(int new_data) {
		node new_node = new node(new_data);
		
		new_node.prev = null;
		
		new_node.next = head;
		
		if(head != null){
			head.prev = new_node;
		}
		head = new_node;
	}
	private void printlist() {
		node n = head;
		while(n != null){
			System.out.println(n.data +" ");
			n = n.next;
		}
	}
	public void rev() {
		node curr = head;
		node temp = null;
		while(curr != null){
			temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			curr = curr.prev;
		}
		if(temp != null){
			head = temp.prev;
		}
 	}
	public static void main(String args[]) {
		ReverseDouble list  = new ReverseDouble();
		

		list.push(6);
		list.push(7);
		list.push(8);
		list.push(9);
		list.push(10);
		
		System.out.println("the double linked list is");
		list.printlist();
		
		list.rev();
		System.out.println("list after the deleteion");
		list.printlist();
	}
}
