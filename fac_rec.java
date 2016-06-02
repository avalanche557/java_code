import java.util.Scanner;

public class fac_rec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ente the size of the series");
		int n  = input.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("%d\n", number(i));
		}
	}
	public static int number(int n){
		if(n==0){
			return 0;
		}
		else if(n==1){
			return 1;
		}
		else{
			return number(n-2)+number(n-1);
		}
	}
}
