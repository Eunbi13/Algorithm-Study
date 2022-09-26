package ps1676;

import java.util.Scanner;

public class Jeongwon_1676_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int two = 0;
		int five = 0;

		// N!안에 존재하는 2*5(10)의 수
		for (int i = 1; i <= N; i++) {
			int n = i;

			while (n % 2 == 0) {
				two++;
				n /= 2;
			}

			while (n % 5 == 0) {
				five++;
				n /= 5;
			}

		}

		System.out.println(five < two ? five : two);
	}

}
