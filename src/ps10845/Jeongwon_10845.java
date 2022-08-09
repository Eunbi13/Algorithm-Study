package ps10845;

import java.util.LinkedList;
import java.util.Scanner;

public class Jeongwon_10845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		LinkedList<Integer> queue = new LinkedList<>();

		for (int i = 0; i < n; i++) {

			String command = sc.next();

			switch (command) {

			case "push":
				int x = sc.nextInt();
				queue.add(x);
				break;

			case "pop":
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.removeFirst());
				}
				break;

			case "size":
				System.out.println(queue.size());
				break;

			case "empty":
				if (queue.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;

			case "front":
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.getFirst());
				}
				break;

			case "back":
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.getLast());
				}
				break;

			}
		}
	}

}
