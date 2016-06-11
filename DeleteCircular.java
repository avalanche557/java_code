import java.util.Random;
import java.util.Scanner;

public class DeleteCircular {
	static node head;
	class node {
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
		if(head != null)
			new_node.prev = new_node;
		
		head = new_node;
	}
	public void delete(node head_ref ,node del) {
		if(head == null && del == null){
			return;
		}
		if(head == del){
			head = del.next;
		}
		if(del.next != null){
			del.next.prev = del.prev;
		}
		if(del.prev != null){
			del.prev.next = del.next; 
		}
		
		return;
	}
	public void printlist() {
		node n = head;
		while(n != null){
			System.out.println(n.data +" ");
			n = n.next;
		}
	}
	public static void main(String args[]) {
			DeleteCircular list = new DeleteCircular();
			
			list.push(6);
			list.push(7);
			list.push(8);
			list.push(9);
			list.push(10);
			
			System.out.println("the double linked list is");
			list.printlist();
			
			list.delete(head, list.head.next.next);
			System.out.println("list after the deleteion");
			list.printlist();
	}
}
