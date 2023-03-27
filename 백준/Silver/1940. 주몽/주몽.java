import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		int si = 0;
		int ei = arr.length-1;
		int answer = 0;
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}

		for(int j=0; j<N; j++) {
			for(int i=1; i<N-j; i++) {
				if(arr[i-1]>arr[i]) {
					int temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;				
				}
			}
		}
		
		while(ei != si) {
			int temp = arr[si] + arr[ei];
			if(temp < M) {
				si++;
			} else if(temp > M) {
				ei--;
			} else {
				si++;
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}