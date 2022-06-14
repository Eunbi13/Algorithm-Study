package ps1463;

import java.util.Scanner;

public class Giyeol1463 {

	public static void method1() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();
		int cnt = 0;
		while (a != 1) {

			if (a % 2 == 0) {
				a = a / 2;
				cnt ++;
			} else if (a % 3 == 0) {
				a = a / 3;
				cnt ++;
			} else {
				a = a - 1;
				cnt ++;
			}
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {

		method1();
	}

}
