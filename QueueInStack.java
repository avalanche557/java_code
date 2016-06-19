import java.util.Random;

public class QueueInStack {
	int top;
	int size;
	int[] ar;
	public QueueInStack(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		ar = new int[size];
		top = -1;
	}
	public void push(int new_data) {
		ar[++top] = new_data;
	}
	public int pop() {
		return ar[top--];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public void print(int i) {
		System.out.println(ar[i]);
	}
	public static void main(String args[]) {
		QueueInStack st1 = new QueueInStack(10);
		QueueInStack st2 = new QueueInStack(10);
		
		for(int i =0 ;i<10; i++){
			st1.push(i);
			st1.print(i);
		}
		while(!st1.isEmpty()){
			int val = st1.pop();
			st2.push(val);
		}
		
		
		System.out.println("the dequeued element is "+st2.pop());
		System.out.println("the dequeued element is "+st2.pop());
		
		
		
		
	}
}
