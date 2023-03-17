import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split(" ");
		String[] arr = br.readLine().split(" ");
		int X = Integer.parseInt(str[1]);
		for(String i: arr) {
			if(Integer.parseInt(i)<X) {
				bw.write(i);
				bw.write(" ");
			}
		}
		bw.flush();
		bw.close();
	}
}