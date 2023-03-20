import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		for(int i=0; i<N; i++) {
			String[] str = scanner.nextLine().split(" ");
			String answer = "";
			int multi = Integer.parseInt(str[0]);
			String[] arr = str[1].split("");
			List<String> arrayList = new ArrayList<String>();
			for(int j=0; j<arr.length; j++) {
				for(int k=0; k<multi; k++) {
					arrayList.add(arr[j]);
				}
			}
			for(int l=0; l<arrayList.size(); l++ ) {
				answer += arrayList.get(l);
			}
			System.out.println(answer);
		}
	}
}
