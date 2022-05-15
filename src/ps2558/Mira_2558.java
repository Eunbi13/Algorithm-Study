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
		a = sc.nextInt();                     // in.next() : 문자열 입력시 공백 전 까지만 받음
		b = sc.nextInt();                     // in.nextLine() : 문자열 입력시 Enter 입력 전까지만 받음
		
		if (0 < a && b < 10) {
			System.out.println(a + b);
		}
		
		
		sc.close();
	}
}

/*
// Reference Type
	// >> Class Type - String Class 
    
		String 문자열_space = in.next();
		String 문자열_Enter = in.nextLine();
		
        
// Primitive Type
	// >> boolean Type
    
		boolean 부울 = in.nextBoolean();
		
        
	// >> Numeric Type
		// >> >> Integer Type
        
		byte 바이트 = in.nextByte();
		short 쇼트 = in.nextShort();
		int 정수 = in.nextInt();
		long 롱 = in.nextLong();
		
        
 
		// >> >> Floating Point Type
        
		double 더블형 = in.nextDouble();
		float 플롯 = in.nextFloat();
*/
