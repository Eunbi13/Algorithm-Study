package ps10799;

import java.util.Scanner;
import java.util.Stack;

public class Jeongwon_10799 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		int result = 0;
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '(')
				stack.push(i);
			else {
				if (stack.pop() == i - 1)
					result += stack.size();
				else
					result += 1;
			}
		}

		System.out.println(result);

	}

}
