import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			String[] arr = str.split("");
			int totalScore = 0;
			int tempScore = 0;
			for(String s : arr) {
				if(s.equals("O")) {
					tempScore++;
				} else if(s.equals("X")) {
					tempScore = 0;
				}
				totalScore += tempScore;
			}
			System.out.println(totalScore);
		}
	}

}
