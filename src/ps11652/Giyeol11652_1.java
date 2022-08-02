package week11.ps11652;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Giyeol11652_1 {

	 public static void main(String[] args) {

	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt();
	      int max = 0;
	      Map<Long, Integer> map = new HashMap<>();

	      for (int i = 0; i < n; i++) {
	         long a = scan.nextLong();
	         
	         if(map.containsKey(a)) {
	            int temp = map.get(a);
	            if(temp + 1>max) {
	               max = temp+1;
	            }
	            map.put(a, map.get(a) + 1);
	         } else {
	            map.put(a,1);
	         }
	      }
	      
	         List<Long> list = new ArrayList<>();
	           for (Map.Entry<Long, Integer> val : map.entrySet()) {
	               if(val.getValue()==max)
	                   list.add(val.getKey());
	           }
	           Collections.sort(list);
	    
	           System.out.println(list.get(0));
	   }
	}