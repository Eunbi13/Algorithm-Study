package ps2558;

// 1000번 문제와 풀이 동일.
/*
1000번 문제와는 다르게 두 수를 한 줄에 한 개씩 입력받지만,
Scanner 클래스의 nextInt() 메서드는 공백(space)이나 개행(enter)로 숫자를 구분하기 때문에
동일한 코드로 해결
*/

import java.util.Scanner;  // canner 패키지는 java.util 패키지에 있기 때문에 java.util.Scanner;로 해줌. 반드시 Scanner 의 첫 단어는 대문자

public class Mira_2558{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);  // 객체생성. System.in 은 입력한 값을 Byte 단위로 읽는 것을 뜻한다.
						      // 보통 가장 많이쓰이는 객체명으로는 in 과 scan, sc이 있다.
		
		int a, b;
		a = sc.nextInt();                     // .next() : 문자열 입력시 공백 전 까지만 받음
		b = sc.nextInt();                     // .nextLine() : 문자열 입력시 Enter 입력 전까지만 받음
		
		System.out.println(a + b);            // a + b 결과 값을 출력.
		
		sc.close();   // Scanner 함수의 사용이 종료되었으므로 객체 sc를 종료해서 메모리에서 반환.
	}
}

/*
// Reference Type
	// >> Class Type - String Class 
    
		String 문자열_space = .next();
		String 문자열_Enter = .nextLine();
		
        
// Primitive Type
	// >> boolean Type
    
		boolean 부울 = .nextBoolean();
		
        
	// >> Numeric Type
		// >> >> Integer Type
        
		byte 바이트 = .nextByte();
		short 쇼트 = .nextShort();
		int 정수 = .nextInt();
		long 롱 = .nextLong();
		
        
 
		// >> >> Floating Point Type
        
		double 더블형 = .nextDouble();
		float 플롯 = .nextFloat();
*/
