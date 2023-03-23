import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		String[] str2 = br.readLine().split(" ");
		int[] sum = new int[N+1];
		sum[0] = 0;
		for(int k=1; k<N+1; k++) {
			sum[k] = sum[k-1] + Integer.parseInt(str2[k-1]);
		}
		for(int l=0; l<M; l++) {
			String[] str3 = br.readLine().split(" ");
			int i = Integer.parseInt(str3[0]);
			int j = Integer.parseInt(str3[1]);
			System.out.println(sum[j]-sum[i-1]);
		}
	}
}