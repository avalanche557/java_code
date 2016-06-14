
public class ParaCheck {
	int size;
	static char[] array;
	int top;
	private static char ch;
	public ParaCheck(int s) {
		size = s;
		array = new char[size];
		top = -1;
	}
	public static void main(String args[]) {
		String input = "({[]})";
		ParaCheck list = new ParaCheck(input.length());
		for(int i=0; i< input.length();i++){
			ch = input.charAt(i);
			if(ch == '(' || ch == '{' || ch =='['){
				list.push(ch);
			}
			if(ch == ')' || ch == '}' || ch == ']'){
				list.pop();
			}
		}
		if(!list.isEmpty()){
			System.out.println("it is not arranged");
		}
		else{
			System.out.println("it is arranged");
		}
		
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
	
}
