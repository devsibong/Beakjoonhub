import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().split(" ");
		String a = str[0];
		String b = str[1];
		int newA = arrToInt(reverseArr(a.split("")));
		int newB = arrToInt(reverseArr(b.split("")));
		if(newA < newB) {
			System.out.println(newB);
		} else {
			System.out.println(newA);
		}
		
	}
	static String[] reverseArr(String[] arr) {
		String[] res = new String[arr.length];
		for(int i=0; i<arr.length; i++) {
			res[arr.length-i-1] = arr[i];
		}
		return res;
	}
	
	static int arrToInt(String[] arr) {
		String temp = "";
		for(int i=0; i<arr.length; i++) {
			temp += arr[i];
		}
		return Integer.parseInt(temp);
	}	
}
