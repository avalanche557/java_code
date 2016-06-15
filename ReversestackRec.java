import java.util.Stack;

public class ReversestackRec {
	public static void main (String[] args) {
	    
		Stack s=new Stack();
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		System.out.println("Input is 1->2->3->4");
		reverse(s);
		System.out.println("Output is");
		while(!s.isEmpty())
		    System.out.print(s.pop()+"  ");
		
		
	}
	static void reverse(Stack s)
	{       
		int pop = 0;
		if(!s.isEmpty())
	    {		
	       pop=Integer.parseInt(""+s.pop());
	               reverse(s);
	   
			insert(s,pop);
		}
	}
	static void insert(Stack s,int p)
	{
	    if (s.isEmpty())
	            s.push(p);
	    else
	    {
	        int temp=Integer.parseInt(""+s.pop());
	        insert(s,p);
	        s.push(temp);
	    }
	}
	
}
