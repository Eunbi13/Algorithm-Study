package ps1924;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class Eunbi_1924 {

  public static void main(String[] args) throws Exception{
  }

  //runtime, 128ms
  //java8은 date사용, java11은 localDate 사용
  public static void one() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    StringTokenizer st = new StringTokenizer(str);
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    
    LocalDate date = LocalDate.of(2007, x, y);
  }
  
  //runtime, 132ms 
  public static void two() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    
    LocalDate date = LocalDate.of(2007, x, y);
    System.out.println(new String(date.getDayOfWeek().toString().getBytes(),0,3));
  }
  
  
  
//  2007년 1월 1일이 월요일이여서 사용 할 수 있는 방법
//  만약 2008년이였다면 1월 1일이 화요일이여서 month의 배열이 다음과 같아야 한다.
//  {26, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//  2022년이라면
//  {29, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//  1월 31일 기준으로,, 몇요일인지 생각해서 INDEX 0 값을 지정해주면 된다...
  public static void three() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); 
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    
    String [] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    int [] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    for(int i = 0; i<x-1; i++) {
      y +=month[i];
    }
    System.out.println(week[(y%7)]);
  }
  
  
//  long startTime = System.nanoTime(); 
//  long endTime = System.nanoTime();
//  System.out.println((endTime-startTime));
//  one: 2146600
//  two: 99000
//  three: 52400
}
