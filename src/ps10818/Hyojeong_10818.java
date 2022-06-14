package ps10818;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hyojeong_10818 {
	//속도 매우 느림
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();  // 입력받을 정수의 갯수
		int[] arr = new int[num]; //배열
		
		for(int i=0; i<num; i++) {   //입력받은거 for문 돌림
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0; i<num; i++){     // 최솟값 찾기
			if(min>arr[i]) {
				min = arr[i];   //arr안에 있는 값보다 적으면 min에 넣어줌
			}
		}
		for(int i=0; i<num; i++) {     //최댓값 찾기
			if(max < arr[i]) {
			 max = arr[i];		//arr안에 있는 값보다 크면 max에 넣어줌
			}
		}
		
		System.out.println(min + " " + max);
		sc.close();
	}
	
	//찾아본 문제
	public static void two() {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		ArrayList<Integer> nums = new ArrayList<Integer>(); //list 자료형 중 ArrayList 사용
		for (int i = 0;i<N;i++) {
			int num = sc.nextInt();
			nums.add(num);
		}									//collection 클래스의 메서드를 사용하여 최대,최소값 찾을 수있음
		Integer max = Collections.max(nums); //리스트에서 최대 값을 찾을 수 있음
		Integer min = Collections.min(nums); //리스트에서 최소 값을 찾을 수 있음
		System.out.println(min + " " + max);
	}
	
}
