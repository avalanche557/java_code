
public class insert_node {
	node head;
	
	class node{
		int data; 
		node next;
		
		node(int d){
			data = d;
			next = null;
		}
	}
	public void push(int new_data){
		node new_node  = new node(new_data);
		new_node.next = head;
		head = new_node;
		
	}
	public void printlist() {
		node n = head;
		while(n != null){
			System.out.println(n.data);
			n = n.next;
		}
	}
	public static void main(String[] args) {
		insert_node list = new insert_node();
		
		list.push(2);
		list.push(4);
		list.push(6);
		
		System.out.println("the linkd list is ");
		list.printlist();
	}
}
