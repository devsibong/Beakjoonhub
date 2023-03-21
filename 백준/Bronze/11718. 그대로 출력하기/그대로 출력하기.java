import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			String str = scanner.nextLine();
			System.out.println(str);
		}
		scanner.close();
	}
}