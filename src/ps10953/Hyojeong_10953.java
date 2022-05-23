package ps10953;

import java.util.Scanner;

public class Hyojeong_10953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();   //입력받아 테스트 할 T를 선언해준다.
		int A , B ; 
		
		for(int i = 0; i < T ; i++) {
			String arr[] = sc.next().split(","); // ,로 잘라준 후 배열에 넣어준다
			//String형태이기 때문에 형변환해줘야함
			//nextLine()은 모든 문자열을 사용
			//next()는 띄어쓰기 전까지만 
			A = Integer.parseInt(arr[0]);
			B = Integer.parseInt(arr[1]);
			
			System.out.println(A+B);
		}
		sc.close();
	}
	

}
