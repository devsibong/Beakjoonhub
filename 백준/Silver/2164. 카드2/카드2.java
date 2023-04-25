import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Deque<Integer> deque = new LinkedList<>();
		for(int i=1; i<=n; i++) {
			deque.add(i);
		}
		while(deque.size()!=1) {
			deque.pollFirst();
			deque.add(deque.pollFirst());
		}
		System.out.println(deque.poll());
	}
}