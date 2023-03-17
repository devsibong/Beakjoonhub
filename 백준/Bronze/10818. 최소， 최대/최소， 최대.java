import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		String maxVal = str[0];
		String minVal = str[0];
		for(String i: str) {
			if(Integer.parseInt(i) >= Integer.parseInt(maxVal)) maxVal=i;
			if(Integer.parseInt(i) <= Integer.parseInt(minVal)) minVal=i;
		}
		System.out.printf("%s %s",minVal, maxVal);
	}
}