import java.util.Scanner;

public class swap_node {
	node head;
	
	class node{
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
	public void printlist() {
		node n = head;
		while(n != null){
			System.out.println(n.data +" ");
			n= n.next;
		}
	}
	public void swap(int x, int y) {
		node curx = head,prex = null;
		node cury = head, prey = null;
		if(x == y){
			return;
		}
		while(curx != null && curx.data != x){
			prex = curx;
			curx = curx.next;
		}
		while (cury != null && cury.data != y){
			prey = cury;
			cury = cury.next;
		}
		if(prex != null){
			prex.next = cury;
		}
		else{
			cury = head;
		}
		if(prey != null){
			prey.next = curx;
		}
		else {
			curx = head;
		}
		 node temp = curx.next;
		 curx.next = cury.next;
		 cury.next = temp;
	}
	public static void main(String[] args) {
		swap_node list = new swap_node();
		
		list.push(5);
		list.push(6);
		list.push(7);
		list.push(8);
		list.push(9);
		list.push(10);
		
		System.out.println("the linked list is ");
		list.printlist();
		
		System.out.println("enter the number you want to swap");
		int num1 = new Scanner(System.in).nextInt();
		int num2 = new Scanner(System.in).nextInt();
		
		list.swap(num1, num2);
		System.out.println("the list after the swappping is ");
		list.printlist();
	}
}
