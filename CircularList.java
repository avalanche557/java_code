import java.util.Random;

public class CircularList {
	node head;
	static class node {
		int data;
		node next;
		
	}
	public void push(int new_data) {
		node new_node = new node();
		new_node.data = new_data;
		new_node.next = head;
		node temp = head;
		if(head == null) {
			new_node.next = new_node;
		}
		else {
		while(temp.next != head){
			temp = temp.next;
		}
		temp.next = new_node;
		}
		head = new_node;
		
	}
	public void printlist() {
		node n = head;
		while(n.next != head){
			System.out.println(n.data +" ");
			n = n.next;
		}
	}
	public static void  main(String args[]) {
		CircularList list = new CircularList();
		
		for(int i =0; i < 10; i++){
			list.push(new Random().nextInt(10));
		}
		System.out.println("the circular linked list is");
		list.printlist();
	}
}