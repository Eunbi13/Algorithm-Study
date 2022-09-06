package ps2609;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_2609 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  public static void main(String[] args) throws Exception{
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num1 = Integer.parseInt(st.nextToken());
    int num2 = Integer.parseInt(st.nextToken());
    
    int d = gcd(num1, num2);
    sb.append(d).append("\n").append(num1*num2/d);
    System.out.println(sb);
  }
  
  static int gcd(int a, int b) {
    while(b!=0) {
      int r = a%b;
      a=b;
      b=r;
    }
    
    return a;
  }
  
  static int gcd2(int a, int b) {
    if(b == 0) {
      return a;
    }
    return gcd2(b, a%b);
  }

//    1차 시도 ㅎ
//    HashSet<Integer> arr1 = new HashSet<>();
//    HashSet<Integer> arr2 = new HashSet<>();
//    int m = 2;
//    while(num1!=1) {
//      if(num1%m==0) {
//        arr1.add(m);
//        num1 /=m;
//      }else {
//        m+= num1%m;
//      }
//    }
//    int m2 = 2;
//    while(num2!=1) {
//      if(num2%m2==0) {
//        arr2.add(m2);
//        num2 /=m2;
//      }else {
//        m2+= num2%m2;
//      }
//    }
//    
//    for(int i = 0; i<arr1.size();i++) {
//      
//    }
//    
//    System.out.println(arr1.toString());
//    System.out.println(arr2.toString());
}
