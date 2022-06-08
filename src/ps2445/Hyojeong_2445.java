package ps2445;

import java.util.Scanner;

public class Hyojeong_2445 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String star = "*";

		for (int i = 1; i <= num; i++) {                  //위쪽 
			for (int j = 0; j < i; j++) {
				System.out.print(star);
			}
			for (int k = 2 * num - i; k > 0; k--) {         
				if (k > i) {                          
					System.out.print(" ");                
				} else {
					System.out.print(star);                
				}
			}
			System.out.println();
		}

		for (int i = 2; i <= num; i++) {               //아래쪽
			for (int j = i; j <= num; j++) {
				System.out.print(star);
			}
			for (int k = 1; k < i * 2 - 1; k++) {
				System.out.print(" ");
			}
			for (int h = num; h >= i; h--) {
				System.out.print(star);
			}
			System.out.println();
		}
		sc.close();
	}
	
	
	//두번째 
	public static void two() {
		  Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        
	        for(int i=0,j=1; i<2*num; i++) {                       
	            for(int k=0; k<2*num; k++) {
	                System.out.print(k>=j && k<2*num-j?" ":"*"); 
	            }
	            if(i<num-1)
	                j++;
	            else
	                j--;
	            
	            System.out.println();
	        }     
	        sc.close();
	    }
	
	
}
