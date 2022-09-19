package ps11576;

import java.util.Scanner;
import java.util.Stack;

public class Jeongwon_11576 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[m + 1];
		for (int i = 1; i <= m; i++) {
			arr[i] = sc.nextInt();
		}
		int c = 0;
		for (int i = 1; i <= m; i++) {
			c += arr[i] * Math.pow(a, m - 1);
		}

		Stack<Integer> stack = new Stack<>();

		while (c != 0) {
			stack.push(c % b);

			c /= b;
		}

		while (!stack.isEmpty()) {
			if (stack.size() == 1) {
				System.out.println(stack.peek());
			} else {
				System.out.print(stack.peek() + " ");
			}

			stack.pop();
		}

	}
}
