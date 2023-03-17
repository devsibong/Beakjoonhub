import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Boolean C = true;
		while(C==true) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			if(A==0 && B==0) {
				C = false;
				break;
			}
			System.out.println(A+B);
		}
	}
}