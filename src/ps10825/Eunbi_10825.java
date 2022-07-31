package ps10825;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Eunbi_10825 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  public static void main(String[] args) throws Exception{
    int n = Integer.parseInt(br.readLine());
    Student [] students = new Student[n];
    
    for(int i = 0; i<n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      students[i] = new Student(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());
    }
    
    Arrays.sort(students, new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
          if(o1.kor<o2.kor) {
            return 1;
          }else if(o1.kor==o2.kor) {
            if(o1.eng>o2.eng) {
              return 1;
            }else if(o1.eng == o2.eng) {
              if(o1.math<o1.math) {
                return 1;
              }else if(o1.math == o2.math){
                return o1.name.compareTo(o2.name);
              }
            }
          }
          return -1;
        }
    });
    
    for(int i = 0; i<n; i++) {
      sb.append(students[i].name).append("\n");
    }
    
    System.out.println(sb);

  }
  
  
//  중첩 클래스, Inner 클래스 
//  특정 클래스를 자신의 클래스 내부적인 용도로만 사용하고자 할 때 효율적
  static class Student{
    String name;
    int kor;
    int eng;
    int math;
    
    //생성자 선언
    public Student(String name, String kor, String eng, String math) {
      // TODO Auto-generated constructor stub
      this.name = name;
      this.kor = Integer.parseInt(kor);
      this.eng = Integer.parseInt(eng);
      this.math = Integer.parseInt(math);
      
    }
  }
  
}
