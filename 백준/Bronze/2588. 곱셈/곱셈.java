import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = B/100;
		int D = (B-C*100)/10;
		int E = B-C*100-D*10;

		System.out.println(A*E);
		System.out.println(A*D);
		System.out.println(A*C);
		System.out.println(A*B);
	}
}
