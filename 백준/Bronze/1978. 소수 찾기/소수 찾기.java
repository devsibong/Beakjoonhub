import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] sosu = new int[1001];
		for(int i=1; i<sosu.length; i++) {
			sosu[i] = i;
		}
		for(int i=2; i<=sosu.length/2; i++) {
			for(int j=2; j<=1000/i; j++) {
				sosu[i * j] =0;
			}
		}
		String[] str = br.readLine().split(" ");
		int[] intArr = new int[str.length];
		for(int i=0; i<str.length; i++) {
			intArr[i] = Integer.parseInt(str[i]);
		}
		int count = 0;
		for(int i : intArr) {
			if(sosu[i] != 0 && i != 1 && i != 0) count++;
		}
		System.out.println(count);
	}
}
