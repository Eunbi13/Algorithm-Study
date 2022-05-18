package ps10951;
// 이 문제에서 가장 중요한 점 : 파일 종료 조건이 없이 그냥 입력이 주어졌다는 것.
// 입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때 반복문을 종료해야 함. (EOF : 데이터가 더이상 존재하지 않을 때 EOF (End of File) 즉, 파일의 끝이라 한다.)

import java.util.Scanner;

public class Mira_10951 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);  // 값을 입력 받기 위해 Scanner 객체 sc를 선언.
	
	int a, b;

	while(sc.hasNextInt()) {  
		a = sc.nextInt();  // 값을 입력받아 변수 a에 저장.
		b = sc.nextInt();  // 값을 입력받아 변수 b에 저장.
		
		System.out.println(a+b); 
	}
	sc.close();   // Scanner 함수의 사용이 종료되었으므로 객체 sc를 종료해서 메모리에서 반환.
	}
}

/*
 Scanner 의 메소드들의 경우 더이상 읽을 데이터가 없으면 NoSuchElementException 을 던지게 된다.
 해결 방법은 
 1. try-catch 문으로 예외발생시 반복문을 종료해주도록 처리.
 2. Scanner 의 메소드인 hasNextInt() 를 통해 처리. 

2번 hasNextInt() 의 경우 
입력값이 정수일경우 true를 반환하며 정수가 아닐경우 바로 예외를 던지며 더이상의 입력을 받지 않고 hasNextInt()에서 false를 반환하면서 반복문이 종료됨.
*/
