import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		int N = Integer.parseInt(temp.split(" ")[0]);
		int M = Integer.parseInt(temp.split(" ")[1]);
		int[] array = new int[N];
		String answer = "";
		
		//array 초기화
		for(int i=0; i<N; i++) {
			array[i] = i+1;
		}
		
		for(int k=0; k<M; k++) {
			String changeBall = scanner.nextLine();
			int i = Integer.parseInt(changeBall.split(" ")[0]);
			int j = Integer.parseInt(changeBall.split(" ")[1]);
			int tempInt=0;
			tempInt = array[i-1];
			array[i-1] = array[j-1];
			array[j-1] = tempInt;
		}
		
		for(int i=0; i<N; i++) {
			answer += array[i];
			answer += " ";
			
		}
		
		System.out.println(answer);
	}
}