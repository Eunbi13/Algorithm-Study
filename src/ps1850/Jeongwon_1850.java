package ps1850;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Jeongwon_1850 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a, b;

		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> bList = new ArrayList<Integer>();
		List<Integer> cList = new ArrayList<Integer>();

		a = sc.nextInt();
		b = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				aList.add(i);
			}
		}

		for (int i = 1; i <= b; i++) {
			if (b % i == 0) {
				bList.add(i);
			}
		}

		for (int i = 0; i < aList.size(); i++) {
			for (int j = 0; j < bList.size(); j++) {
				if (aList.get(i).equals(bList.get(j))) {
					cList.add(aList.get(i));
				}
			}
		}

		int max = Collections.max(cList);

		for (int i = 0; i < max; i++) {
			System.out.print("1");
		}

	}

}
