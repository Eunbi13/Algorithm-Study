package ps11656;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Jeongwon_11656 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			list.add(s.substring(i, s.length()));
		}

		Collections.sort(list);

		for (String i : list) {
			System.out.println(i);
		}
	}
}
