
public class InfixToPostfix {
	static String input;
	static String output="";
	private stack thestack;
	private char val;
	public InfixToPostfix(String in) {
		input = in;
		int stacksize = input.length();
		thestack = new stack(stacksize);
	}
	public String post() {
		for(int i = 0;i < input.length();i++){
			char ch = input.charAt(i);
			switch (ch) {
			case '+':
			case '-':
				change(ch, 1);
				break;
			case '*':
			case '/':
				change(ch, 2);
				break;
			case '(':
				thestack.push(ch);
				break;
			case ')':
				gotpar(ch);
				break;

			default:
				output = output + ch;
				break;
			}
		}
		while(!thestack.isEmpty()){
			 output = output + thestack.pop();
			
			
		}
		System.out.println(output);
		return output;
	}
	
	
	private void gotpar(char ch) {
		// TODO Auto-generated method stub
		while(!thestack.isEmpty()){
			char chx = thestack.pop();
			if( chx == '('){
				break;
			}
			else{
				output = output +chx;
			}
		}
		
	}
	private void change(char ch, int pec1) {
		// TODO Auto-generated method stub
		while(!thestack.isEmpty()){
			char optop = thestack.pop();
			if(optop == '('){
				thestack.push(optop);
				break;
			}
			else{
				int pec2 ;
				if(optop == '+' || optop == '-'){
					pec2 = 1;
				}
				else {
					pec2 = 2;
					if(pec1 < pec2){
						thestack.push(optop);
						break;
					}
					else {
						output = output + optop;
					}
				}
			}
			
		}
		thestack.push(ch);
		
	}
	public static void main(String args[]) {
		input = "1+2*4/5-7";
		InfixToPostfix list = new InfixToPostfix(input);
		output = list.post();
		
		
	}
	class stack{
		int stacksize;
		char[] array;
		int top ;
		public stack(int s) {
			stacksize = s;
			array = new char[s];
			top = -1;
		} 
		public void push(char item) {
			array[++top] = item;
		}
		public char pop() {
			return array[top--];
		}
		public char peek() {
			return array[top];
		}
		public boolean isEmpty() {
			return (top == -1);
		}
	}
}
