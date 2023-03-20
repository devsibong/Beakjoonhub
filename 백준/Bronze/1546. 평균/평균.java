import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] arr = new int[N];
		int maxVal = 0;
		float sum = 0.0f;
		for(int i=0; i<N; i++) {
			arr[i] = scanner.nextInt();
		}
		for(int i=0; i<N; i++) {
			if(maxVal<arr[i]) maxVal=arr[i];
		}
		for(int i=0; i<N; i++) {
			sum += (float)arr[i]/maxVal*100;
		}
		System.out.println(sum/N);
	}
}