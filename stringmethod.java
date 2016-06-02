import java.util.Scanner;

public class stringmethod {
	public static void main(String[] args) {
		String[] name = new String[20];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < name.length; i++) {
			name[i] = input.nextLine();
		}
		for (int i = 0; i < name.length; i++) {
			if(name[i].startsWith("go")){
				System.out.println(name[i]);
			}
			if (name[i].endsWith("av")) {
				System.out.println(name[i]);
			}
		}
	}
}
