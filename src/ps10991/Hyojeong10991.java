package ps10991;

import java.util.Scanner;

public class Hyojeong10991 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// String star = "*";
		String starTwo = "* "; // 띄어쓰기 한 별을 넣어줌

		for (int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print(starTwo);
			System.out.println();
		}
		sc.close();
	}

	// 두번째
	public static void two() {
		 Scanner sc = new Scanner(System.in);
	        
	        int n=sc.nextInt();
	        
	        for(int i=1; i<=n; i++) {
	        	for(int j=1; j<=n-i; j++) {
	        		System.out.printf(" ");
	        	}
	        	for(int j=1; j<=i*2-1; j++) {
	        		if(j%2==1) {
	        			System.out.printf("*");}
	        		else{
	        			System.out.printf(" ");
	        		}
	        	}System.out.println();
	        }
		}

}
