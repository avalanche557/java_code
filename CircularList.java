import java.util.Random;

public class CircularList {
node head;
 static class node {
	 int data;
	 node next;
	 node (int d){
		 data = d;
	 }
 }
 public void push(int new_data) {
	node new_node = new node(new_data);

	new_node.next = head;
	head = new_node;
	
}
 
 public void printlist() {
	
}
 public static void main(String args[]) {
	CircularList list = new CircularList();
	
	for(int i=0; i < 10; i++){
		list.push(new Random().nextInt(6));
	}
	System.out.println("the circlular linked list is ");
	list.printlist();
	
}
 
}
