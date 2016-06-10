import java.util.Random;

public class CircularLinkedlist_end {
	node head;
	 static class node {
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
	public void printlist() {
		node n = head;
		while(n.next != head){
			System.out.println(n.data +" ");
			n = n.next;
		}
	}
	 public static void main(String args[]) {
		CircularLinkedlist_end list = new CircularLinkedlist_end();
		
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(2);
		list.push(5);
		
		System.out.println("the circular linked list is");
		list.printlist();
	}
}
