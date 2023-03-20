import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[9];
		int maxVal = 0;
		int maxIndex = 0;
		for(int i=0; i<9; i++) {
			array[i] = scanner.nextInt();
		}
		for(int i=0; i<9; i++) {
			if(array[i] > maxVal) {
				maxVal = array[i];
				maxIndex = i+1;
			}
		}
		System.out.println(maxVal);
		System.out.println(maxIndex);
	}
}