import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String[] temp = br.readLine().split(" ");
		int[] arr = new int[temp.length];
		int[] answer = new int[temp.length];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}
		
		Stack<Integer> stack = new Stack();
		for (int i = 0; i < arr.length; i++) {
			if(stack.isEmpty()) {
				stack.push(i);
			} else if (arr[stack.peek()] > arr[i]) {
				stack.push(i);
			} else {
				while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
					answer[stack.pop()] = arr[i];
				}
				stack.push(i);
			}
		}
		while(!stack.isEmpty()) {
			answer[stack.pop()] = -1;
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<answer.length; i++) {
			sb.append(answer[i]);
			sb.append(" ");
		}
		
		System.out.println(sb.toString());
	}
}