import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		Deque<Node> deq = new LinkedList<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			
			while(deq.isEmpty() == false && deq.getLast().value > temp) {
				deq.removeLast();
			}
			deq.addLast(new Node(i, temp));
			if(deq.getFirst().index <= i-L) deq.removeFirst();
			bw.write(String.valueOf(deq.getFirst().value));
			bw.write(" ");
		}
		bw.flush();
	}

}

class Node {
	Node(int index, int value) {
		this.index = index;
		this.value = value;
	}
	public int index;
	public int value;
}
