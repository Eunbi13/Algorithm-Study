package ps2440;

import java.util.Scanner;

public class Hyojeong_2440 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String star = "*";

		for(int i=num;i>0;i--) { 
			for(int j=0;j<i;j++) { 
				System.out.print(star);
			}
			System.out.println();
		}
		sc.close();
	}

}
