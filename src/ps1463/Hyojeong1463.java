package ps1463;

import java.util.Scanner;

public class Hyojeong1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 참고한 사이트
		// https://iseunghan.tistory.com/336
		// 1. 테이블 정의 --> dp[i] = 정수가 i를 1로 만들 때 연산을 하는 최솟값
		// 2. 점화식 찾기 --> (1.) 2로 나눈 나머지가 0일 경우 2로 나눔
		// (2.) 3으로 나눈 나머지가 0일 경우 3으로 나눔
		// (3.) 1을 뺀다.
		// 3. 초기값 정하기 --> dp[1] = 0;

		// 0부터 시작해서 입력한 값의 답을 찾을 때까지 무한루프 도는 방식
		int num = sc.nextInt();
		int[] dp = new int[num + 1];
		dp[1] = 0;

		for (int i = 2; i <= num; i++) {
			dp[i] = dp[i - 1] + 1;
			if (i % 2 == 0) { //2로 떨어지면 2로 나눔
				dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 1을 뺀 값과 2로 나눈 값 중 최솟값을 dp[i]에 저장
			}
			if (i % 3 == 0) { //3으로 떨어지면 3으로 나눔
				dp[i] = Math.min(dp[i], dp[i / 3] + 1); // 1을 뺀 값과 2로 나눈 값 중 최소값인 dp[i] 와 3으로 나눈 값 중 최솟값을 dp[i]에 저장
			}
		}
		System.out.print(dp[num]);
		sc.close();
	}
}
