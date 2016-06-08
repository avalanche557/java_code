import java.util.Random;

public class MergSort {
	static node head;
	
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

	public void printlist() {
		node n = head;
		while(n != null){
			System.out.println(n.data +" ");
			n= n.next;
		}
	}
	public static node getmid(node head){
		node fast = head;
		node slow = head;
		while(slow.next != null && fast.next.next != null){
			fast= fast.next.next;
			slow = slow.next;
			
		}
		return slow;

	}
	public node merg(node head) {
		if(head == null || head.next == null){
			return head;
		}
		node midnode = getmid(head);
		node secondlist = midnode.next;
		midnode.next = null;
		return mergsort(merg(head), merg(secondlist));
	}
	
	public static node mergsort(node h1, node h2) {
		node result;
		if(h1 == null){
			return h2;
		}
		if(h2 == null){
			return h1;
		}
		if(h1.data <= h2.data){
			result = h1;
			result.next = mergsort(h1.next, h2);
		}
		else {
			result = h2;
			result.next = mergsort(h1, h2.next);
		}
		return result;
	}
	
	public static void main(String[] args) {
		MergSort list = new MergSort();
		
		for (int i = 0; i < 10; i++) {
			list.push(new Random().nextInt(50));
		}
		System.out.println("unsorted list is");
		list.printlist();
		
		list.merg(head);
		System.out.println("sorted list is");
		list.printlist();
	}
}
