import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] strArray = str.split(" ");
		int n1 = Integer.parseInt(strArray[0]);
		int n2 = Integer.parseInt(strArray[1]);
		int n3 = Integer.parseInt(strArray[2]);
		int temp1 = 0;
		int temp2 = 0;
		int max = n1;
		if(n1 <= n3 && n2 <= n3) {
			max = n3;
		}
		if(n1 <= n2 && n3 <= n2) {
			max = n2;
		}
		if(n2 <= n1 && n3 <= n1) {
			max = n1;
		}
		if(n1 == n2) {
			temp1++;
			temp2 = n1;
		}
		if(n2 == n3) {
			temp1++;
			temp2 = n2;
		}
		if(n1 == n3) {
			temp1++;
			temp2 = n1;
		}
		
		if(temp1==1)
			System.out.println(1000+temp2*100);
		if(temp1==3)
			System.out.println(10000+temp2*1000);
		if(temp1==0)
			System.out.println(max*100);
		
	}
}
