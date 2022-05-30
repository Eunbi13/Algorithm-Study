package ps8393;

import java.util.Scanner;

public class Hyojeong_8393 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	        int total = 0;
	        for(int i=0; i<=T; i++) {
	        	total += i;
	        }
	        System.out.println(total);
	        sc.close();
	    }
	}
