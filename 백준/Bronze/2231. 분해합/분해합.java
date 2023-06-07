import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strArr = str.split("");
		int jari = strArr.length;
		int N = Integer.parseInt(str);
		int minNum = N-9*jari;
		boolean run = true;
		for(int i=minNum; i<=N; i++) {
			if(yeonsan(i)==N) {
				System.out.println(i);
				run = false;
				break;
			}
		}
		if(run==true) System.out.println(0);
	}
	public static int yeonsan(int i) {
		int n = i;
		int temp = 0;
		while(n >= 10) {
			temp += (n%10);
			n /= 10;
		}
		temp += n;
		temp += i;
		return temp;
	}
}