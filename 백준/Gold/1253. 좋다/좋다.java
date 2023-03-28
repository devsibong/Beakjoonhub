import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] arr = new long[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					long temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		long answer = 0;
		for(int ai=0; ai<arr.length; ai++) {
			int si = 0;
			int ei = arr.length-1;
			while(si != ei) {
				long temp = arr[si] + arr[ei];
				if(temp < arr[ai]) {
					si++;
				} else if(temp > arr[ai]) {
					ei--;
				} else if(ai != si && ai != ei) {
					answer++;
					break;
				} else if(ai == si) {
					si++;
				} else if(ai == ei) {
					ei--;
				}
			}
		}
		
		System.out.println(answer);
	}
}