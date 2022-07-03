package ps11055;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_11055 {

  static int [] arr ;
  static int [] dp ;
  static int max;

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
    for(int i = 0; i<n;i++) {
      if(i==0) {
        dp[i]=arr[i];
        continue;
      }
      else if(arr[i]>dp[idx-1]) {
        dp[idx]=arr[i];
        idx++;
      }
      else {
        flag = findFlag(idx, i); 
        dp[flag] = arr[i];
      }
      
      int x = 0;
      
      for(int j = 0; j<idx; j++) {
        x += dp[j];
        if(x>max) {
          max = x;
        }
        System.out.println(dp[j]);
      }
      System.out.println("================ x: "+x+" ---------- max: "+max);
    }
    
    System.out.println(max);


  }

  static int findFlag(int idx, int i ) {
    int mid = idx/2;
    int k = 0;
    while(k<idx) {
      
      mid = (k+idx)/2;
      
      if(dp[mid] < arr[i]) {
        k = mid+1;
      }
      else if(dp[mid-1] > arr[i]) {
        k = mid+1;
      }
      else {
        return mid;
      }

    }
    return mid;
  }




}
