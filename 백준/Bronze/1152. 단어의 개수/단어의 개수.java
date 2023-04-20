import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int cnt = 1;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') cnt++;			
		}
		if(str.charAt(0) == ' ') cnt--;
		if(str.charAt(str.length()-1) == ' ') cnt--;
		System.out.println(cnt);
	}
}
