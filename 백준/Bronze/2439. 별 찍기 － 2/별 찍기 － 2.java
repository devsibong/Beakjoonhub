import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = scanner.nextInt();
		String temp="";
		String blank=" ";
		for(int i=1; i<=n; i++) {
			for(int j=0; j<n-i; j++) {
				bw.write(" ");
			}
			for(int k=0; k<i; k++) {
				bw.write("*");
			}
			bw.newLine();
			bw.flush();
			
		}
	}
}