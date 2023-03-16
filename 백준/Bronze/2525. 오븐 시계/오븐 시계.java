import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int T = scanner.nextInt();
		String[] strArray = str.split(" ");
		int H = Integer.parseInt(strArray[0]);
		int M = Integer.parseInt(strArray[1]);
		int totalMin = 60*H + M + T;
		if(totalMin >= 24*60) {
			System.out.println(totalMin/60-24 + " " + totalMin%60);
			
		} else {
			System.out.println(totalMin/60 + " " + totalMin%60);
		}
		
		
	}
}
