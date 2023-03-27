import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int si = 1;
		int ei = 1;
		int answer = 1;
		
		while(ei != N) {
			int temp = (si + ei)*(ei - si + 1)/2;
			if(temp < N) {
				temp += ei;
				ei++;
			}
			else if(temp == N) {
				temp += ei;
				ei++;
				answer++;
			} else if(temp > N) {
				temp -= si;
				si++;
				
			}
		}
		
		System.out.println(answer);
	}
}