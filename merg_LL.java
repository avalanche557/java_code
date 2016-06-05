import javax.naming.spi.DirStateFactory.Result;

public class merg_LL {
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
	public void printlist(){
		node n = head;
		while(n != null){
			System.out.println(n.data +" ");
			n = n.next;
		}
	}
	public void merg(merg_LL list1, merg_LL list2) {
		node a = list1.head;
		node b = list2.head;
		
		merg_LL list3 = new merg_LL();
		
		if( b == null || b == null){
			System.out.println("the list is empty");
		}
		if( a == null){
			list2.printlist();
		}
		if(b == null){
			list2.printlist();
		}
		while (a != null && b != null){
			if(a.data < b.data){
				list3.push(a.data);
				a = a.next;
			}
			else {
				list3.push(b.data);
				b = b.next;
			}
			
		}
		if( a == null){
			while(b != null){
				list3.push(b.data);
				b = b.next;
			}
		}
		if(b == null){
			while(a != null){
				list3.push(a.data);
				a = a.next;
			}
		}
		list3.printlist();
		
		
	}
	public static void main(String[] args) {
		merg_LL list1 = new merg_LL();
		merg_LL list2 = new merg_LL();
		merg_LL result = new merg_LL();
		
		list1.push(10);
		list1.push(8);
		list1.push(7);
		System.out.println("the first linked list is");
		list1.printlist();
		
		list2.push(20);
		list2.push(9);
		list2.push(6);
		System.out.println("the second list is");
		list2.printlist();
		
		
		System.out.println("linked list after the merg is");
		result.merg(list1,list2);
		
		
	}
}
