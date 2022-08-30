package ps1158;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Jeongwon_1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();

        int N = sc.nextInt();
        int K = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while (q.size() > 1) {
            for (int i = 0; i < K-1; i++) {
                int value = q.poll();
                q.offer(value);
            }

            sb.append(q.poll()).append(", ");
        }

        sb.append(q.poll()).append(">");
        System.out.println(sb);
    }
}

// queue.add(1) queue에 1이란 값 추가  * illegalStateExceptionq발생
// queue.offer(1) queue에 1이란 값 추가 *add 차이점 큐가 가득차서 더이상 추가할 수 없는 경우 false 추가되면 true 반환
// queue.poll() queue에 첫번째 값 반환
// queue.peek() queue에 첫번째 값 참조
// queue.remove() queue 첫번째 값 제거
// queue.clear() queue 초기화
