import java.util.Random;


public class StackPop {
		int size;
		int[] array;
		int top;
		StackPop(int s) {
			size =s;
			array = new int[size];
			top = -1;
		}
		public void push(int i) {
			array[++top] = i;
			System.out.println("the item pushed is"+i);
 		}
		public int pop() {
			return array[top--];
		}
		public int peek() {
			return array[top];
		}
		public boolean IsEmpty() {
			return(top == -1);
		}
	public static void main(String args[]) {
		StackPop list = new StackPop(10);
		
			list.push(new Random().nextInt(10));
			list.push(new Random().nextInt(10));
			list.push(new Random().nextInt(10));
			list.push(new Random().nextInt(10));
			list.push(new Random().nextInt(10));
			list.push(new Random().nextInt(10));
			list.push(new Random().nextInt(10));
			list.push(new Random().nextInt(10));
			list.push(new Random().nextInt(10));
			list.push(new Random().nextInt(10));
		while(!list.IsEmpty()){
			int value = list.pop();
			System.out.println(value);
			System.out.println(" ");
		}
	}
	
}
