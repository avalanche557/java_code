import java.util.Scanner;

public class Gp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the value of a");
		double a = input.nextDouble();
		System.out.println("enter the common ratio");
		double r = input.nextDouble();
		System.out.println("enter the size of the GP");
		double n = input.nextDouble();
		for (int i = 0; i < n; i++) {
			System.out.printf("%f\n", numb(a,r,i));
		}
	}
	public static double numb(double a, double r, double n){
		return (a*Math.pow(r,n));
	}
}
