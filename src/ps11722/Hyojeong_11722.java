package ps11722;

import java.util.Scanner;

public class Hyojeong_11722 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

      int num = sc.nextInt();
      int arr[] = new int[num + 1];
      int d[] = new int[num + 1];

      for (int i = 1; i <= num; i++)
          arr[i] = sc.nextInt();

      d[1] = 1;

      for (int i = 2; i <= num; i++) {
          d[i] = 1;
          for (int j = 0; j < i; j++) {
              if (arr[i] < arr[j] && d[i] <= d[j]) {
                  d[i] = d[j] + 1;
              } else if (arr[i] == arr[j]) {
                  d[i] = d[j];
              }
          }
      }

      int max = 0;

      for (int i = 1; i <= num; i++)
          max = Math.max(d[i], max);

      System.out.println(max);

      sc.close();
  }
}

