import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean run = true;
		while(run) {
			String[] str = br.readLine().split(" ");
			int[] intArr = new int[str.length];
			for(int i=0; i<str.length; i++) {
				intArr[i] = Integer.parseInt(str[i]);
			}
			
			for(int i=0; i<intArr.length-1; i++) {
				for(int j=0; j<intArr.length-i-1; j++) {
					if(intArr[j]>intArr[j+1]) {
						int temp = intArr[j+1];
						intArr[j+1] = intArr[j];
						intArr[j] = temp;
					}
				}
				
			}
			
			int a = intArr[0];
			int b = intArr[1];
			int c = intArr[2];
			
			if(a == 0 && b == 0 && c== 0) {
				run = false;
				br.close();
			} else {
				if(a*a + b*b == c*c) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			}
			
		}
		
	}

}
