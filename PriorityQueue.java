
public class PriorityQueue {
	node front;
	node rare;
	int length;
	public PriorityQueue() {
		// TODO Auto-generated constructor stub
		rare = null;
		front = null;
		length =0;
	}
	class node {
		int data;
		int pr;
		node next;
		node(int d, int p){
			data = d;
			pr = p;
			next = null;
		}
	}
	public void deletenode(int key) {
		node temp = front;
		node prev = null;
		if(temp != null && temp.pr == key){
			front = temp.next;
			return;
		}
		while(temp != null && temp.pr != key ){
			prev = temp;
			temp = temp.next;
		}
		if(temp == null){
			return;
		}
		prev.next = temp.next;
		
	}
	public void enqueue(int new_data, int pr) {
		node new_node = new node(new_data, pr);
		
		if(isEmpty()){
			rare = front = new_node;
		}
		else{
			rare.next = new_node;
			rare = new_node;
		}
		length++;
	}
	public boolean isEmpty() {
		return (length == 0);
	}
	public void dequeue() {
		int highest = front.pr;
		node temp = front;
		while(temp.next != null){
			if(highest < temp.pr){
				highest = temp.pr;
			}
			temp = temp.next;
		}
		deletenode(highest);
		
	}
	public void print() {
		node n = front;
		System.out.println("data\tpriority");
		while(n != null){
			System.out.printf("%d\t %d\n", n.data, n.pr);
			n = n.next;
		}
	}
	public static void main(String args[]) {
		PriorityQueue qu = new PriorityQueue();
		
		qu.enqueue(5,2);
		qu.enqueue(6,1);
		qu.enqueue(7,4);
		qu.enqueue(8,3);
		System.out.println("the queue elements with there priority are");
		qu.print();
		qu.dequeue();
		System.out.println("after deleting the element with the top priority");
		qu.print();
	}
	
}

