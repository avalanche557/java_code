import java.util.Random;

public class HalfCircular {
	static node head;
	static node head1;
	static node head2;
	class node{
		int data;
		node next;
	}
	public void push(int new_data) {
		node new_node = new node();
		new_node.data = new_data;
		node temp = head;
		if(head == null){
			head = new_node;
			new_node.next = new_node;
		}
		else{
			while(temp.next != head){
				temp = temp.next;
			}
			temp.next = new_node;
			new_node.next = head;
		}
	}
	public void printlist(node head) {
		node n = head;
		while(n.next != head){
			System.out.println(n.data +" ");
			n = n.next;
		}
		System.out.println(n.data +" ");
	}
	public void splitlist() {
		node slow = head;
		node fast = head;
		
		while(fast.next != head && fast.next.next != head){
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast.next.next == head){
			fast = fast.next;
		}
		head1 = head;
		head2 = slow.next;
		fast.next = slow.next;
		
		slow.next = head;
	}
	
	public static void main(String args[]) {
		HalfCircular list = new HalfCircular();
		
		for(int i=0; i < 10; i++){
			list.push(new Random().nextInt(10));
		}
		
		System.out.println("the linked list is");
		list.printlist(head);
		
		list.splitlist();
		System.out.println("first list is");
		list.printlist(head1);
		System.out.println("second list is");
		list.printlist(head2);
		
	}
}
