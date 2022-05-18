package ps10950;

import java.util.Scanner;

public class Mira_10950 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);  // 값을 입력 받기 위해 Scanner 객체 sc를 선언.
	
	int T = 0;  // 초기값 0으로 선언.
	int a = 0;
	int b = 0;
	int i;
	
	T = sc.nextInt();  // 값을 입력받아 변수 T에 저장.
	
	for(i=1; i<=T; i++) {  // i가 1부터 T까지 범위에서 반복.
		a = sc.nextInt();  // 값을 입력받아 변수 a에 저장.
		b = sc.nextInt();  // 값을 입력받아 변수 b에 저장.
		
		int c = 0;  // int 형 변수 c 를 초기값 0으로 선언.
		
		c = a + b;  // a + b 의 결괏값을 변수 c에 저장.
		
		System.out.println(c);  // 변수 c에 저장된 값을 출력.
	}
	sc.close();  // Scanner 함수의 사용이 종료되었으므로 객체 sc를 종료해서 메모리에서 반환.
	}
}
