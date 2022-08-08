package new_ex.week12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Giyeol10845 {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int last = 0;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {

			String order = scan.next();

			switch (order) {
			case "push":
				last = Integer.parseInt(scan.next());
				queue.offer(last);

				break;

			case "pop":

				if(queue.size() == 0) {
					sb.append(-1);
					sb.append("\n");
				} else {
					sb.append(queue.peek());
					sb.append("\n");
					queue.remove();
					
				}

				break;
			case "size":
				sb.append(queue.size()).append("\n");

				break;
			case "empty":
				if(queue.size() == 0) {
					sb.append(1);
					sb.append("\n");
				} else {
					sb.append(0);
					sb.append("\n");
				}


				break;
			case "front":
				if(queue.size() == 0) {
					sb.append(-1);
					sb.append("\n");
				} else {
					sb.append(queue.peek());
					sb.append("\n");
				}

				break;
			case "back":
				if(queue.size() == 0) {
					sb.append(-1);
					sb.append("\n");
				} else {
					sb.append(last);
					sb.append("\n");
				}

				break;
			}

		}
		System.out.println(sb);
	}
}
