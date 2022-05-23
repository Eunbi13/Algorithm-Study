package ps11022;

import java.util.Scanner;

public class Hyojeong_11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int A,B,C;
		for(int i=0; i<T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			C = A+B;
			System.out.println("Case #"+ (i+1)+": " + A + " + " + B + " = "+ (A+B));
		}
		sc.close();
		//출력 띄어쓰기 주의..
	} 
}
