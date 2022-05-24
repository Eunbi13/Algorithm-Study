package ps11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Hyojeong_11720 {
	public static void main(String[] args) {
		//scanner 클래스 사용해서 하기 1
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 테스트 케이스 입력받음
		int total = 0; // 입력 받아 더한 값
		String num = sc.next(); // 넘버 String으로 받음

		for (int i = 0; i < n; i++) { // charAt()를 이용하면 char형태를 반환한다함
			total += num.charAt(i) - '0'; // '0'을 쓰는 이유는 아스키 코드를 갖고 있기 때문이라고 함!
		}                                  // '0' 또는 '48' 을 빼주어야 함
		sc.close();
		System.out.println(total);
	}

	public static void test2() {
		//scanner 클래스 사용해서 하기 2
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String num = sc.next();
		int total = 0;
		for (int i = 0; i < n; i++) {
			total += Integer.parseInt(num.substring(i, i + 1)); //문자열 잘라서 사용하기
		}
		sc.close();
		System.out.println(total);
	}
	
	public static void test3() throws IOException {
		//BufferedReader , InputStreamReader
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		bf.readLine();
		
		int total = 0;
		
		for(byte value : bf.readLine().getBytes()) {
			total +=(value - '0'); // 테스트 1번과 마찬가지로 인코딩에 따라 문자 값 저장하기 때문에 0 빼줌
		}
		System.out.println(total);
		
	}
}
