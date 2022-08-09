package ps9012;

import java.util.Scanner;
import java.util.Stack;

public class Jeongwon_9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println(stack(sc.next()));
		}
	}

	public static String stack(String s) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (c == '(') {
				stack.push(c);
			} else if (stack.empty()) {
				return "NO";
			} else {
				stack.pop();
			}

		}

		if (stack.empty()) {
			return "YES";
		} else {
			return "NO";
		}

	}

}
