import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().split("");
		int[] arr = new int['z'-'a'+1];
		String answer = "";
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		for(char i=0;i<arr.length; i++) {
			for(int j=0; j<str.length; j++) {
				if(str[j].charAt(0)==i+'a') {
					if(arr[i] == -1) arr[i] = j;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			answer += arr[i];
			answer += " ";
		}
		
		System.out.println(answer);
	}
}
