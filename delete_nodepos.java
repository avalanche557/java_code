
public class delete_nodepos {
	node head;
	
	class node{
		int data;
		node next;
		node(int d) {
			data = d;
			next = null;
		}
	}
	public void push(int new_data) {
		node new_node = new node(new_data);
		
		new_node.next = head;
		head = new_node;
	}
	public void printlist() {
		node n = head;
		while(n != null){
			System.out.println(n.data +" ");
			n = n.next;
		}
	}
	public void delete(int pos) {
		if (head == null)
			return;
		node temp = head; 
		if(pos == 0){
			head = temp.next;
			return;
		}
		for(int i =0; temp != null && i < pos-1;i++){
			temp = temp.next;
		}
		
		if (temp == null || temp.next == null)
			return;
		
		node next = temp.next.next;
		
		temp.next = next;
	}
	public static void main(String[] args) {
		delete_nodepos list = new delete_nodepos();
		
		list.push(4);
		list.push(6);
		list.push(7);
		list.push(8);
		list.push(9);
		
		System.out.println("the linked list is");
		list.printlist();
		
		list.delete(2);
		System.out.println("the list after the deletion is ");
		list.printlist();
	}
}
