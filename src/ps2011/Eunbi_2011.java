package ps2011;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_2011 {

  static Long dp[];
  static int m = 1000000;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer(br.readLine());

    dp = new Long[sb.length() + 1];
    dp[1] = 1L;
        dp[0] = 1L;

    for (int i =1; i < sb.length()+1; i++) {
      System.out.println("i"+i);
      int num = sb.charAt(i - 1) - '0';
      if (1 <= num && num <= 9) {
          dp[i] += dp[i - 1];
          dp[i] %= m;
      }
      
      if (i == 1) {
        continue;
    }
      
      if ((sb.charAt(i - 2) - '0') == 0) {
          continue;
      }
      

      if (Integer.parseInt(sb.substring(i - 2, i)) <= 26) {
          dp[i] += dp[i - 2];
          dp[i] %= m;
      }
  }
    System.out.println(dp[sb.length()] % m);


  }
//왜 틀린지 모르겠네
  static void two(String sb) throws Exception {
    for (int i = 1; i < sb.length(); i++) {


      // 0으로 시작하는 경우 || 1230 처럼, 맨 마지막이 0인데 두글자가 안되는 경우
      if (Long.parseLong(sb.substring(0, 1)) == 0
          || Long.parseLong(sb.substring(sb.length() - 2, sb.length())) > 26) {
        dp[sb.length()] = 0L;
        break;
      } else if (Long.parseLong(sb.substring(i, i + 1)) == 0
          || Long.parseLong(sb.substring(i - 1, i)) == 0) {
        dp[i + 1] = dp[i] = dp[i - 1] % m;
      } else if (Long.parseLong(sb.substring(i - 1, i + 1)) <= 26) {
        dp[i + 1] = dp[i] % m + dp[i - 1] % m;
      } else {
        dp[i + 1] = dp[i] % m;
      }

      System.out.println("dp[" + (i + 1) + "]: " + dp[i + 1] + " dp[" + (i - 1) + "]: " + dp[i - 1]
          + " dp[" + i + "]: " + dp[i]);

    }
    System.out.println(dp[sb.length()] % m);
  }
  
  
  
  
//   반례 1203을 극복 못한 버전
  static void one(String sb) throws Exception {
    for (int i = 2; i < sb.length() + 1; i++) {
      System.out
          .println(" @@@@ sb.substring(i-2, i): " + sb.substring(i - 2, i) + " sb.substring(i, i): "
              + sb.substring(i, i) + " sb.substring(i-1, i): " + sb.substring(i - 1, i));
      // 1 @@@@ sb.substring(i-2, i): 25
      // 2 @@@@ sb.substring(i-2, i): 51
      // 3 @@@@ sb.substring(i-2, i): 11
      // 4 @@@@ sb.substring(i-2, i): 14

      // 0으로 시작하는 경우 || 1230 처럼, 맨 마지막이 0인데 두글자가 안되는 경우
      if (Integer.parseInt(sb.substring(0, 1)) == 0
          || Integer.parseInt(sb.substring(sb.length() - 2, sb.length())) > 26) {
        dp[sb.length()] = 0L;
        break;
      } else if (Integer.parseInt(sb.substring(i - 2, i)) <= 26
          && Integer.parseInt(sb.substring(i, i + 1)) != 0
          && Integer.parseInt(sb.substring(i - 1, i)) != 0) {
        dp[i] = dp[i - 1] % m + dp[i - 2] % m;
      } else {
        dp[i] = dp[i - 1];
      }

    }
  }


}
