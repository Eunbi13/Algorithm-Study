package ps11718;

import java.util.Scanner;

public class Hyojeong_11718 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				String A;
				while(sc.hasNext()) { //while로 반복문을 돌려주고 입력이 있으면 true
					A = sc.nextLine(); //없으면 false 반환해준다 
					System.out.println(A); // = 입력한 대로 출력
				}
			sc.close();
	}
}
