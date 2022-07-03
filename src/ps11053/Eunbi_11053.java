package ps11053;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_11053 {

  static int [] arr ;
  static int [] dp ;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    arr = new int [n];
    dp = new int [n];
    for(int i = 0; i<n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    int idx = 1;
    int flag = 0;
    for(int i =0; i<n; i++) {
      if(i==0) {
        dp[i]=arr[i];
      }
      else if(arr[i]>arr[i-1]) {
        dp[idx]=arr[i];
        idx++;
      }
      else {
        flag = findFlag(idx, i); //4 4
        dp[flag] = arr[i];
      }
    }

    ;
    System.out.println(idx);

  }//https://ahnyezi.github.io/dp/b11053/


  static int findFlag(int idx, int i) { //4 4
    
/* 1번 방법 : 문제점 의미 없이 한번 더 루프를 돈다. 
 * 
    int half = idx/2; //2
    int k = half; //2
    
    while(k <= idx) { // 2 <=4 //3<=4
      if(dp[half]<arr[i]) { //dp[2] =4 < arr[4] = 3 //dp[1] =2 < arr[4] = 3
        half++; //2
        k++; //4
      }
      else if(dp[half]>arr[i]){ //dp[2] =4 > arr[4] = 3 //dp[2] =4 > arr[4] = 3
        half--; //1 //1
        k++; //3 //5
      }
      else {
        return half;
      }
    } 
    return half;
*/
  int start = 0;

  while (start <= idx){                   // 0<=4  start = 3 <= idx = 2
      int mid = (start + idx) / 2;        // mid = 2 //mid = (3+4)/2 = 3  //mid = 3+4 /2 = 2
  
      if (dp[mid] < arr[i]){              //dp[2] =4 < arr[4] = 3 // 
          start = mid + 1;                //start = 3;
      }
      else if (dp[mid] > arr[i]){         // dp[3] =4 > arr[4] = 3
          idx = mid - 1;                  //idx = 2;
      }
      else{
          return mid;
      }
  }

  return start;

  }

  static void one() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    arr = new int [n];
    dp = new int [n];
    for(int i = 0; i<n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    dp[0]=1;
    for(int i = 1; i<n; i++) {
      for(int j = 0; j<i; j++) {
        if(arr[i]>arr[j]) {
          dp[i] = Math.max(dp[i], dp[j]+1);
        }
      }
    }
    System.out.println(dp[n]);
  }


}
