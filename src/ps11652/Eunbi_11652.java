package ps11652;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Eunbi_11652 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  public static void main(String[] args) throws Exception{
    int n = Integer.parseInt(br.readLine());

    HashMap<Long, Integer> map = new HashMap<>();
    for(int i = 0; i<n; i++) {
      Long card = Long.parseLong(br.readLine());
      map.put(card, map.getOrDefault(card, 0)+1);
    }
    
    int max = 0;
    ArrayList<Integer> list = new ArrayList<Integer>(map.values());
    for(Integer val : list) {
      System.out.println(val); //print : 3, 2
      if(max < val) {
        max = val;
      }
    }
    
    PriorityQueue<Long> q = new PriorityQueue<>();
    // 밸류로 키 조회하기
    for(Long key :map.keySet()){
        if(max==map.get(key)){
            q.add(key);
        }
    }
    System.out.println(q.poll());

  }

  static void one() throws Exception{
    int n = Integer.parseInt(br.readLine());

    HashMap<Long, Integer> map = new HashMap<>();

    int max = 0;
    long x = 0;
    for(int i = 0; i<n;i++) {
      Long card = Long.parseLong(br.readLine());
      //  getOrDefault:  찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
      map.put(card, map.getOrDefault(card, 0)+1);

      if(map.get(card)>max) {
        max = map.get(card);
        x = card;
      }else if(map.get(card)==max) {
        x = Math.min(x, card);
      }
    }
    System.out.println(x);

  }

  static void two() throws Exception{
    int n = Integer.parseInt(br.readLine());

    PriorityQueue<Long> pq = new PriorityQueue<Long>();
    for(int i = 0; i<n;i++) {
      pq.add(Long.parseLong(br.readLine()));
    }

    int max = 0;
    int cnt = 1;
    long answer = pq.peek(); //peek : 첫번째 값 반환(가장 작은수)

    while(!pq.isEmpty()) {
      long cur = pq.poll();//poll : 첫번째 값 반환 후 제거
      while(!pq.isEmpty()) {
        if(cur == pq.peek()) {
          cnt++;
          pq.poll();
        }
        else break;
      }
      if(max < cnt) {
        max = cnt;
        answer = cur;
      }
      cnt = 1;
    }
  }
}


