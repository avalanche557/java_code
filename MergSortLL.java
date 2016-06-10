import java.util.Random;

public class MergSortLL {
	node first;
	node last;
	static class node{
		int data;
		node next;
		node (int d){
			data = d;
		}
		
	}
	public MergSortLL(){
		first = null;
		last = null;
	}
	
	public void printlist() {
		node n = first;
		while(n != null){
			System.out.println(n.data +" ");
			n = n.next;
		}
	}
	public void push(int new_data) {
		node new_node = new node(new_data);
		new_node.next = first;
		first = new_node;
	}
	public node getNode(){
		return first;
	}
	public static void main(String args[]){
		MergSortLL list = new MergSortLL();
		
		for(int i= 0; i< 10;i++){
			list.push(new Random().nextInt(50));
		}
		System.out.println("the unsorted list is ");
		list.printlist();
		
	}
}
