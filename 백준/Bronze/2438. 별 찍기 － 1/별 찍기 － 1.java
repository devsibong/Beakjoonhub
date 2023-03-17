import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String temp="";
		for(int i=0; i<n; i++) {
			temp += "*";
			System.out.println(temp);
		}
	}
}