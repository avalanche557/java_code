import java.util.Random;
import java.util.Scanner;

public class DeleteCircular {
	node head;
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
		new_node.prev = new_node;
		
		head = new_node;
	}
	public void delete(int num) {
		node temp = head;
		while(temp != null){
			if(temp.data == num){
				temp.next.prev = temp.prev;
				temp.prev.next = temp.next;
			}
			temp = temp.next;
			return;
		}
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
			
			for(int i =0; i < 10; i++){
				list.push(new Random().nextInt(10));
			}
			System.out.println("the double linked list is");
			list.printlist();
			
			System.out.println("enter the number you want to delete");
			int num = new Scanner(System.in).nextInt();
			list.delete(num);
			System.out.println("list after the deleteion");
			list.printlist();
	}
}
