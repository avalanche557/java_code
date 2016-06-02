import java.util.Scanner;

public class Gp_rec {
	public static double a;
	public static double r;
	public static double n;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the value of a");
		a = input.nextDouble();
		System.out.println("enter the common ratio");
		r = input.nextDouble();
		System.out.println("enter the size of the GP");
		n = input.nextDouble();
		for (int i = 1; i <= n; i++) {
			System.out.printf("%f\n", numb(i));
		}
	}
	public static double numb(double n) {
		if(n==1){
			return a;
		}
		else if(n==2){
			return a*r;
		}
		else {
			return (a*r)*Math.pow(r, numb(n-2));
		}
		
	}
	
}
