import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		int answer = 0;
		ArrayList<Integer> arrList = new ArrayList<>();
		for(int i=0; i<10; i++) {
			arr[i] = scanner.nextInt() % 42;
		}
		for(int i : arr) {
			boolean temp = false;
			for(int j : arrList) {
				if(i == j) {
					temp = true;
				}
			}
			if(temp == false) {
				arrList.add(i);
			}
		}
		System.out.println(arrList.size());
	}
}