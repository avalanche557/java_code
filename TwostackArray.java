
public class TwostackArray {
		int size;
		int[] array;
		int top1, top2;
		public TwostackArray(int s) {
			// TODO Auto-generated constructor stub
			size = s;
			array = new int[size];
			top1 = -1;
			top2 = size;
			
		}
		public void push1(int new_data) {
			++top1;
			array[top1] = new_data;
		}
		public void push2(int new_data) {
			top2--;
			array[top2] = new_data;
		}
		public int pop1() {
			return array[top1--];
		}
		public int pop2() {
			return array[top2++];
		}
		public static void main(String args[]) {
			TwostackArray list = new TwostackArray(10);
			
			list.push1(4);
			list.push1(5);
			list.push1(6);
			list.push1(7);
			list.push2(10);
			list.push2(9);
			list.push2(12);
			
			int val1 = list.pop1();
			System.out.println("the value poped from first stack is " + val1);
			int  val2 = list.pop2();
			System.out.println("the value poped from second tack is " +val2);
			
			
			
		}
}
