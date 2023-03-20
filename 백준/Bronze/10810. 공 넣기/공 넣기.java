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
			array[i] = 0;
		}
		
		for(int i=0; i<M; i++) {
			String putBall = scanner.nextLine();
			int I = Integer.parseInt(putBall.split(" ")[0]);
			int j = Integer.parseInt(putBall.split(" ")[1]);
			int k = Integer.parseInt(putBall.split(" ")[2]);
			
			for(int index=I-1; index<j; index++) {
				array[index] = k;
			}
		}
		
		for(int i=0; i<N; i++) {
			answer += array[i];
			answer += " ";
			
		}
		System.out.println(answer);
	}
}