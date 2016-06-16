import java.util.Random;
public class GetMin {
	int[] a;
	int[] aux;
	static int top;
	public GetMin(int size) {
		// TODO Auto-generated constructor stub
		a = new int[size];
		aux = new int[size];
		top = -1;
	}
	public void push(int item) {
		if( top == a.length){
			System.out.println("the stack is full");
			return;
		}
		if(top == -1){
			a[top+1] = item;
			aux[top+1]= item;
		}
		else{
			if(top<a.length && item < aux[top]){
				a[top+1]= item;
				aux[top+1] = item;
			}
			else if(top<a.length && item >= aux[top]){
				aux[top+1] = aux[top];
				a[top+1] = item;
				
			}
		}
		top++;
		
	}
	public int min() {
		return aux[top];
	}
	
	public int pop() {
		return a[top--];
	}
	
	public int peek() {
		return a[top];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public static void main(String rags[]) {
		GetMin st = new GetMin(6);
		
		st.push(6);
		st.push(9);
		st.push(12);
		st.push(14);
		st.push(45);
		st.push(20);
		int val= st.min();
		while(!st.isEmpty()){
			System.out.println(st.pop());
		}
		System.out.println("the mininum no is");
		System.out.println(val);
		
		
	}
	
	
}
