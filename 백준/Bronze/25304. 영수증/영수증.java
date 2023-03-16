import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        int total = 0;
        for(int i=0; i<N; i++) {
        	int product = scanner.nextInt();
        	int count = scanner.nextInt();
        	total += product*count;
        }
        if(total == X) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }
}
