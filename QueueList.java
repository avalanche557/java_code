
public class QueueList {
	node rare,front;
	int length;
	public QueueList() {
		// TODO Auto-generated constructor stub
		rare =  null;
		front = null;
		length = 0;	
	}
	class node{
		int data;
		node next;
		node(int d){
			data = d;
			next = null;
		}	
	}
	public void enqueue(int new_data) {
		node new_node = new node(new_data);
		if(isEmpty()){
			 rare = front = new_node;
		}
		else{
			rare.next = new_node;
			rare = new_node;
		}
		length++;
	}
	public void dequeue() {
		front = front.next;
		length--;
	}
	public Boolean isEmpty() {
		return(length == 0);
	}
	public void print() {
		node n = front;
		while(n != null){
			System.out.println(n.data +" ");
			n= n.next;
		}
	}
	public static void main(String args[]) {
		QueueList qu = new QueueList();
		
		qu.enqueue(5);
		qu.enqueue(6);
		qu.enqueue(7);
		qu.print();
		qu.dequeue();
		qu.print();
		
	}
	
}
