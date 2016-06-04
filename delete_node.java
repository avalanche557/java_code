
public class delete_node {
	node head;
	
	class node {
		int data;
		node next;
		node(int d){
			data = d;
			next = null;
		}
	}
	public void push(int new_data) {
		node new_node = new node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void printlist(){
		node n = head;
		while( n != null){
			System.out.println(n.data +" ");
			n = n.next;
		}
	}
	
	public void delete(int pos){
		node temp = head;
		if(head == null){
			return;
		}
		if(pos == 0){
			temp.next = head;
		}
		for(int i = 0 ; temp != null && i<pos-1;i++){
			temp = temp.next;
		}
		if(temp == null || temp.next == null){
			return;
		}
		node next = temp.next.next;
		
		temp.next = next;
	}
	public static void main(String[] args){
		delete_node list = new delete_node();
		
		list.push(5);
		list.push(6);
		list.push(7);
		list.push(9);
		list.push(10);
		System.out.println("the linkedlist is");
		list.printlist();
		
		
		list.delete(3);
		System.out.println("the linkedlist is");
		list.printlist();
	}
}
