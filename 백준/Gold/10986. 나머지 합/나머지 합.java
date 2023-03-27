
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		long[] arr = new long[N+1];
		long[] sum = new long[N+1];
		long[] rem = new long[N+1];
		long[] tem = new long[M];
		long answer = 0;
		// 숫자 배열 초기화
		for(int i=1; i<=N; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
				
		//합 배열 초기화
		for(int i=1; i<=N; i++) {
			sum[i] = sum[i-1] + arr[i];
		}
		
		//나머지 배열 초기화
		for(int i=1; i<=N; i++) {
			int j = (int)(sum[i] % M);
			rem[i] = j;
			tem[j]++;
			if(j == 0) answer++; // 나머지 0인 경우
			
		}
		
		for(int i=0; i<M; i++) {
			if(tem[i] > 1) answer += tem[i]*(tem[i]-1)/2;
		}
		
		System.out.println(answer);
	}
}