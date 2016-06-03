
public class linkedlist1 {
	node head;
	 public static class node{
		 int data;
		 node next;
		 
		 node(int d){
			 data = d;
			 next = null;
		 }
	 }
		 
		 public static void main(String[] args) {
			linkedlist1 list = new linkedlist1();
			
			list.head  = new node(1);
			node second = new node(2);
			node third = new node(3);
			
			list.head.next = second;
			second.next = third;
			
			list.printlist();
		 }

		public void printlist() {
			// TODO Auto-generated method stub
			node n = head;
			 while(n != null){
				 System.out.println(n.data+ " ");
				 n= n.next;
			 }
		}
}
