import java.util.Random;

public class MergSort {
	node head;
	
	static class node{
		int data;
		node next;
		node (int d){
			data =d;
			next = null;
		}
	}
	public void push(int new_data) {
		node new_node = new node(new_data);
		
		new_node.next = head;
		head =new_node;
	}
	public void printlist() {
		node n = head;
		while(n != null){
			System.out.println(n.data +" ");
			n= n.next;
		}
	}
	public static void main(String[] args) {
		MergSort list = new MergSort();
		
		for (int i = 0; i < 10; i++) {
			list.push(new Random().nextInt(50));
		}
		System.out.println("unsorted list is");
		list.printlist();
		
		
		System.out.println("sorted list is");
		list.printlist();
	}
}
