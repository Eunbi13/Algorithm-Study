package week14.ps11655;

import java.util.Scanner;

public class Giyeol11655 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<word.length(); i++) {
			int su = (int) word.charAt(i);
	
				if (65 <= su && su <= 90) {
	        	 if(su<77) {
	        		 su = su + 13;
	        		 } else {
	        			 su = su - 13;
	        		 }
	        	 sb.append((char) su);	        	 
	         } else if (97 <= su && su <= 122) {
	        	 if(su<109) {
	        		 su = su + 13;
	        		 } else {
	        			 su = su - 13;
	        		 }
	        	 sb.append((char) su);	  
	         } else {
	        	 sb.append((char) su);	  
	         }
		}
		System.out.println(sb);
	}
}
