import java.util.Scanner;

public class fac {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the series");
		int n = input.nextInt();
		int[] ar = new int[n];
		number(ar);
		
	}
	
	public static void number(int ar[]) {
		ar[0] = 1;
		ar[1] =1;
		for (int i = 2; i < ar.length; i++) {
			ar[i] = ar[i-1]+ar[i-2];
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}
