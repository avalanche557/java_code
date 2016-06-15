import java.util.Random;

public class SortStack {
	int size;
	int top;
	static int[] a;
	public SortStack(int s) {
		// TODO Auto-generated constructor stub
		size = s;
		a = new int[10];
		top = -1;
	}
	
	public static void main(String args[]) {
		SortStack st = new SortStack(10);
		
		st.fill();
		System.out.println("the unsorted list is");
		st.printlist();
		st.sort(a);
		System.out.println("the sorted list is");
		st.printlist();
	}
	public void push(int item) {
		a[++top] = item;
	}
	public int pop() {
		return a[top--];
	}
	public int peek() {
		return a[top];
	}
	
	
	public void printlist() {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] +" ");
		}
		return;
	}
	public void fill() {
		for (int i = 0; i < a.length; i++) {
			push(new Random().nextInt(10));
		}	
	}
	public void sort(int[] a){
		if( top != -1){
			int temp = pop();
			sort(a);
			insert(a, temp);
		}
	}
	public void insert(int[] a, int temp) {
		if(top == -1){
			push(temp);
		}
		else{
			
			if(temp > peek()){
				int c = pop();
				insert(a, temp);
				push(c);
			}
			else{
				push(temp);
			}
			
		}
	}
	

}
