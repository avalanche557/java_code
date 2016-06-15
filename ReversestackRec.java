
import java.util.*;

public class ReversestackRec {
	

public static void main (String[] args) {
	    
		Stack<Character> s=new Stack<Character>();
		String input = "abhinav";
		for (int i = 0; i < input.length(); i++) {
			s.push(input.charAt(i));
		}
		System.out.println("Input is 1->2->3->4");
		reverse(s);
		System.out.println("Output is");
		while(!s.isEmpty())
		    System.out.print(s.pop()+"  ");
		
		
	}
	static void reverse(Stack<Character> s)
	{       
		 char pop = 0;
		if(!s.isEmpty())
	    {		
	       pop=(char) Integer.parseInt(""+s.pop());
	               reverse(s);
	   
			insert(s,pop);
		}
	}
	static void insert(Stack<Character> s,int p)
	{
	    if (s.isEmpty())
	            s.push((char) p);
	    else
	    {
	        int temp=Integer.parseInt(""+s.pop());
	        insert(s,p);
	        s.push((char) temp);
	    }
	}
	
}
