import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String bombStr = br.readLine();
		Stack<Character> stack = new Stack<>();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<str.length(); i++) {
			stack.push(str.charAt(i));
			if(stack.size() >= bombStr.length()) {
				boolean isBomb = true;
				for(int j=0; j<bombStr.length(); j++) {
					if(stack.get(stack.size()-bombStr.length()+j) != bombStr.charAt(j)) {
						isBomb = false;
						break;
					}
				}
				if(isBomb) {
					for(int j=0; j<bombStr.length(); j++) {
						stack.pop();
					}
				}
				
			}
		}
		
		for(char ch : stack) {
			sb.append(ch);
		}
		
		if(stack.size()==0) {
			System.out.println("FRULA");
		} else {
			System.out.println(sb.toString());
		}
	}
}