import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		int[][] arr = new int[N+1][N+1];

		// 숫자 배열 초기화
		for (int i = 1; i <= N; i++) {
			String[] str2 = br.readLine().split(" ");
			for (int j = 1; j <= N; j++) {
				arr[i][j] = Integer.parseInt(str2[j-1]);
			}
		}

		int[][] sumArr = new int[N+1][N+1];

		// 합 배열 초기화
		for (int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				sumArr[i][j] = sumArr[i-1][j] + sumArr[i][j-1] + arr[i][j] - sumArr[i-1][j-1]; 
			}
		}

//		for (int i = 0; i < N+1; i++) {
//			String temp = "";
//			for (int j = 0; j < N+1; j++) {
//
//				temp += sumArr[i][j];
//			}
//			System.out.println(temp);
//		}

		// 정답 출력
		for (int i = 0; i < M; i++) {
			StringTokenizer str3 = new StringTokenizer(br.readLine());
			int O = Integer.parseInt(str3.nextToken());
			int P = Integer.parseInt(str3.nextToken());
			int Q = Integer.parseInt(str3.nextToken());
			int R = Integer.parseInt(str3.nextToken());
			System.out.println(sumArr[Q][R] - sumArr[O-1][R] - sumArr[Q][P-1] + sumArr[O-1][P-1]);
		}
	}
}