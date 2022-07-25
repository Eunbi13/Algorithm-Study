package ps2751;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Jeongwon_2571_4 {

	// Scanner + Collections.sort, 시간초과
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n;

		n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		Collections.sort(list);

		for (int i = 0; i < n; i++) {
			System.out.println(list.get(i));
		}
	}

}
