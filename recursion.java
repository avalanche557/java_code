import java.util.Scanner;

public class recursion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int n = input.nextInt();
		System.out.printf("factorial of %d is %d ", n, fact(n));
	}
	
	public static int fact(int n) {
		if(n <=1){
			return 1;
		}
		else{
			return n * fact(n-1);
		}
	}

}
