import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[30];
		int[] std = new int[2];
		int index=1;
		String answer = "";
		
		//arr 초기화
		for(int i=0; i<30; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<28; i++) {
			int temp=scanner.nextInt();
			for(int j=0; j<30; j++) {
				if(arr[j]==temp) arr[j]=0;
			}
		}
		
		for(int i=0; i<30; i++) {
			if(arr[i] != 0) {
				if(index==1) {
					std[0] = arr[i];
					index = 0;
				} else {
					std[1] = arr[i];
				}
			}
		}
		
		if(std[0] < std[1]) {
			answer += std[0];
			answer += " ";
			answer += std[1];
		} else {
			answer += std[1];
			answer += " ";
			answer += std[0];
		}
		
		System.out.println(answer);
	}
}