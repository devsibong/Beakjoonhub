import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		Long answer = 0L;
		String[] strArray = str.split(" ");
		for(String i : strArray) {
			answer += Long.parseLong(i);
		}

		System.out.println(answer);
	}
}
