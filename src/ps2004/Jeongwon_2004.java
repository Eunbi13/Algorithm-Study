package ps2004;

import java.util.Scanner;

public class Jeongwon_2004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long r = sc.nextLong();

		long five = 0;
		long two = 0;

		five = fiveCount(n);
		two = twoCount(n);

		five -= fiveCount(r);
		five -= fiveCount(n - r);

		two -= twoCount(r);
		two -= twoCount(n - r);

		System.out.println(five < two ? five : two);
	}

	public static long fiveCount(long n) {
		long cnt = 0;

		for (long i = 5; i <= n; i *= 5) {
			cnt += n / i;
		}

		return cnt;
	}

	public static long twoCount(long n) {
		long cnt = 0;

		for (long i = 2; i <= n; i *= 2) {
			cnt += n / i;
		}

		return cnt;
	}

}
