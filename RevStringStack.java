
public class RevStringStack {
	private String input;
	private String output = "";
	private stack thestack;
	class stack{
		int size;
		char[] array;
		int top;
		public stack(int s) {
			// TODO Auto-generated constructor stub
			size  = s;
			array = new char[s];
			top = -1;	
		}
		public void push(char item) {
			array[++top] = item;
		}
		public char pop() {
			return array[top--];
		}
		public boolean isEmpty() {
			return (top == -1);
		}
		public char peek() {
			return array[top];
		}
	}
	public static void main(String args[]) {
		String input = "abhinav";
		String output;
		
		RevStringStack list = new RevStringStack(input);
		output = list.reverse();
		System.out.println("the reverse of the string is " + output);
		
	}
	public RevStringStack(String in) {
		input = in;
		int stacksize = input.length();
		thestack = new stack(stacksize);
	}
	public String reverse() {
		
		for(int i =0; i < input.length();i++){
			char ch = input.charAt(i);
			thestack.push(ch);
		}
		while(!thestack.isEmpty()){
			char val = thestack.pop();
			output = output + val;
			
		}
		return output;
	}
}
