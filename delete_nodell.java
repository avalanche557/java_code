
public class delete_nodell {
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
		node new_node = new node(new_data);
		
		new_node.next = head;
		head = new_node;
	}
	
	public void printlist(){
		node n = head;
		
		while(n != null){
			System.out.println(n.data +" ");
			n = n.next;
		}
	}
	public void delete(int key){
		node temp = head, prev = null;
		
		if(temp != null && temp.data == key){
			head = temp.next;
			return;
		}
		while(temp != null && temp.data != key){
			prev = temp;
			temp = temp.next;
		}
		if(temp == null)
			return;
		
		prev.next = temp.next;
	}
	public static void main(String[] args) {
		delete_nodell list = new delete_nodell();
		
		list.push(4);
		list.push(6);
		list.push(7);
		list.push(8);
		list.push(9);
		
		System.out.println("the linked list is");
		list.printlist();
		
		list.delete(9);
		System.out.println("the list after the deletion is ");
		list.printlist();
		
	}

}
