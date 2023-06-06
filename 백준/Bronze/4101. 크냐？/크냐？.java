import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean run = true;

		while (run) {
			String str1 = br.readLine();
			String[] str = str1.split(" ");
			int[] arr = new int[2];
			
			if(str1.equals("0 0")) {
				run = false;
				break;
			}
			for (int i = 0; i < str.length; i++) {
				arr[i] = Integer.parseInt(str[i]);
			}
			String result = arr[0] > arr[1] ? "Yes" : "No";
			System.out.println(result);

		}
	}

}
