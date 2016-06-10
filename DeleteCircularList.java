import java.util.Scanner;

public class DeleteCircularList {
	node head;
	
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
	public void printlist() {
		node n = head;
		while(n.next != head){
			System.out.println(n.data +" ");
			n = n.next;
		}
		System.out.println(n.data +" ");
	}
	public void delete(int pos) {
		node temp = head;
		node prev = null;
		if(pos == 0){
			return;
		}
		if(pos == 1){
			while(temp.next != head){
				temp = temp.next;
			}	
		}
		temp.next= temp.next.next;
		return;
	}
	public static void main(String args[]) {
		DeleteCircularList list = new DeleteCircularList();
		
		for(int i=0; i<10;i++){
			list.push(i+5);
		}
		System.out.println("the linked list is ");
		list.printlist();
		System.out.println("enter the pos you want to delete");
		int pos = new Scanner(System.in).nextInt();
		list.delete(pos);
		System.out.printf("list after the deletion of %d node is \n", pos );
		list.printlist();
	}
}
