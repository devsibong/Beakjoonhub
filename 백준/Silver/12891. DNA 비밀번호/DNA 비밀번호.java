import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		str = br.readLine();
		String[] strArr = str.split("");
		str = br.readLine();
		String[] requireArr = str.split(" ");
		int[] requireIntArr = new int[4];
		for(int i=0; i<4; i++) {
			requireIntArr[i] = Integer.parseInt(requireArr[i]);
		}
		int[] compareArr = new int[4];
		
		for(int i=0; i<M; i++) {
			if(strArr[i].equals("A")) compareArr[0]++;
			if(strArr[i].equals("C")) compareArr[1]++;
			if(strArr[i].equals("G")) compareArr[2]++;
			if(strArr[i].equals("T")) compareArr[3]++;
		}
		int answer = 0;
		if(requireIntArr[0] <= compareArr[0] &&
			requireIntArr[1] <= compareArr[1] &&
			requireIntArr[2] <= compareArr[2] &&
			requireIntArr[3] <= compareArr[3]) answer++;
		for(int i=1; i<N-M+1; i++ ) {
			if(strArr[i-1].equals("A") && compareArr[0] > 0) compareArr[0]--; 
			if(strArr[i-1].equals("C") && compareArr[1] > 0) compareArr[1]--; 
			if(strArr[i-1].equals("G") && compareArr[2] > 0) compareArr[2]--; 
			if(strArr[i-1].equals("T") && compareArr[3] > 0) compareArr[3]--; 
			if(strArr[i+M-1].equals("A")) compareArr[0]++;
			if(strArr[i+M-1].equals("C")) compareArr[1]++;
			if(strArr[i+M-1].equals("G")) compareArr[2]++;
			if(strArr[i+M-1].equals("T")) compareArr[3]++;
			if(requireIntArr[0] <= compareArr[0] &&
				requireIntArr[1] <= compareArr[1] &&
				requireIntArr[2] <= compareArr[2] &&
				requireIntArr[3] <= compareArr[3]) answer++;
		}
		System.out.println(answer);

	}
}