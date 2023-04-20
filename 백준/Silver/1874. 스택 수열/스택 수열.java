import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		List<Integer> popList = new ArrayList<>();
		Stack<Integer> st = new Stack<>();
		boolean isNo = false;
		StringBuffer sb = new StringBuffer();
		// 배열
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int i = 1;
		st.push(i); // 첫 수를 스택에 추가
		sb.append("+\n");
		i++;
		
		int k = 0;
		
		while (popList.size() < n) {
			if (!st.isEmpty()) {
				if (st.peek() < arr[k]) {
					st.push(i);
					i++;
					sb.append("+\n");
					continue;
				} else if (st.peek() == arr[k]) {
					popList.add(st.pop());
					sb.append("-\n");
					k++;
					continue;
				}

				else if (st.peek() > arr[k]) {
					isNo = true;
					break;
				}
			} else {
				st.push(i);
				i++;
				sb.append("+\n");
				continue;
			}
		}
		
		if (isNo) {
			System.out.println("NO");
		} else {
			System.out.println(sb.toString());
		}
	}
}
