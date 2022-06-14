package ps2442;

import java.util.Scanner;

public class Hyojeong_2442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String star = "*";
		for (int i = 0; i < num; i++) {
			for (int j = 1; j < 2 * num; j++) {
				if (j >= num-i && j <= num + i) { // 중앙을 기준으로 +-i 범위에서는 별을 찍기.
					System.out.print(star);
				} else {
					System.out.print(" ");
				}
				if (j > num + i)
					break; 
			}
			System.out.println();
		}
		sc.close();
	}
}
