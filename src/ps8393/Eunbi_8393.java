package ps8393;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_8393 {

  public static void main(String[] args) throws Exception{
    one();
  }

//  runtime, 136ms 
  public static void one() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    long startTime = System.nanoTime();
    
    int a = (1+n)*n /2 ; // >> 1 로 쓸수도 있다.
    
    long endTime = System.nanoTime();
    System.out.println(a+" || "+(endTime-startTime));
  }
//  runtime, 124ms
  public static void two() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    int sum = 0;
    long startTime = System.nanoTime();
    for(int i =1; i<=n; i++) {
      sum += i;
    }
    long endTime = System.nanoTime();
    System.out.println(sum+" || "+(endTime-startTime));
  }
  
//  연산시간 계산 
//  long startTime = System.nanoTime(); 
//  long endTime = System.nanoTime();
//  System.out.println(a+" || "+(endTime-startTime));
  
//  입력하는 수 : 100 
//  one: 300    || 200  || 300
//  two: 1300   || 1700 || 1400
  
//  연산 시간 계산 방법으로는 System.currentTimeMillis() 활용할 수 도 있음 
}
