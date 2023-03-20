import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		String[] str = scanner.nextLine().split("");
		int sum = 0;
		for(String i : str) {
			sum += Integer.parseInt(i);
		}
		System.out.println(sum);
		
	}
}