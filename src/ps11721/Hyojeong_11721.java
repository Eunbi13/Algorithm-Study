package ps11721;

import java.util.Scanner;

public class Hyojeong_11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine(); //입력받는 단어 변수
		int textL = text.length(); //입력 받는 단어의 글자수
		int count = 0;
		
		for (int i=0; i<textL; i++) {          //입력받은 단어만큼 for문 실행
			System.out.print(text.charAt(i));   //반복문 돌린만큼 출력
			count ++;							//1씩 증가
			
			if (count == 10) {			//10이 되면 
				System.out.println();		//줄바꿈해줌
				count = 0;					//초기화
			}
			sc.close();
		}
	}
	
	
	
/////찾아본 코드
	public static void test2() {
		Scanner sc = new Scanner(System.in);
		StringBuilder result = new StringBuilder(); //String builder 사용
		String str = sc.next();
		
		int a = str.length()/10;
		
		for(int i=0;i<a;i++) {
			result.append(str.substring(i*10,(i+1)*10)); 
			result.append("\n");
		}
		
		result.append(str.substring(a*10));
		
		System.out.println(result);
	}
	
}