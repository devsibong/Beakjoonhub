import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		int[] arr = new int[N];
		String answer="";
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		for(int k=0; k<M; k++) {
			String change = scanner.nextLine();
			int i = Integer.parseInt(change.split(" ")[0]);
			int j = Integer.parseInt(change.split(" ")[1]);
			for(int n=0; n<(j-i+1)/2; n++) {
				int temp = arr[i+n-1];
				arr[i+n-1] = arr[j-n-1];
				arr[j-n-1] = temp;
			}
		}
		for(int i=0; i<N; i++) {
			answer += arr[i];
			answer += " ";
		}
		System.out.println(answer);
	}
}