
public class StackPush {
	static int size;
	static int[] array;
	int top;
	public StackPush(int s) {
		// TODO Auto-generated constructor stub
		size = s;
		array = new int[size];
		top = -1;
	}
	public void push(int new_data) {
		array[++top] = new_data;
	}
	public int pop() {
		return array[top--];
	}
	public static void main(String args[]) {
		StackPush stack = new StackPush(6);
		int i = 0;
		while(i != size){
			stack.push(i);
			System.out.println(array[i]);
			i++;
		}
		System.out.println("pop function is used");
		while(size != 0){
			int value = stack.pop();
			System.out.printf("%d\n", value);
			size--;
		}
		
		
		
		
	}
	

}
