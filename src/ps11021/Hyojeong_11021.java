package ps11021;

import java.util.Scanner;

public class Hyojeong_11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt() ; //테스트 케이스 받음
		int A,B ;
		for(int i=0; i<T; i++) {
			// String 형태 배열로 받아 정수형으로 형변환
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println("Case #" + (i+1) + ": " + (A+B));
		//또는 for문 i=1; 로 해도 가능
		}
		sc.close();
	}
}
