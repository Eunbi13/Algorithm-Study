package new_ex.week12;

import java.util.Scanner;
import java.util.Stack;

public class Giyeol10828 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Stack stack = new Stack<>();
		
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {

			String order = scan.next();

			switch (order) {
			case "push":
				stack.push(Integer.parseInt(scan.next()));
				break;

			case "pop":
				if(stack.size() == 0) {
					sb.append(-1);
					sb.append('\n');
				}else {
					sb.append(stack.peek());
					sb.append('\n');
					stack.pop();
				}

				break;
				
			case "size":
					sb.append(stack.size());
					sb.append('\n');
				break;
				
			case "empty":
					if(stack.size() == 0) {
						sb.append(1);
						sb.append('\n');
					} else {
						sb.append(0);
						sb.append('\n');
					}
				break;
				
			case "top":
				if(stack.size() == 0) {
					sb.append(-1);
					sb.append('\n');
				}else {
					sb.append(stack.peek());
					sb.append('\n');
				}

				break;

			default:
				break;
			}
			

		}
		System.out.println(sb);

	}

}
