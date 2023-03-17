import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt()/4;
		String str = "";
		for (int i=0; i<n; i++) {
			str += "long ";
		}
		System.out.println(str+"int");
    }
}
