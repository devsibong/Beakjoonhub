import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberX = scanner.nextInt();
		int numberY = scanner.nextInt();
		if(numberX > 0 && numberY > 0) {
			System.out.println(1);
		}
		if(numberX < 0 && numberY > 0) {
			System.out.println(2);
		}
		if(numberX < 0 && numberY < 0) {
			System.out.println(3);
		}
		if(numberX > 0 && numberY < 0) {
			System.out.println(4);
		}
	}
}
