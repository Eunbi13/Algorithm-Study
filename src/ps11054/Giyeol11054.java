package week7.ps11054;

import java.util.Scanner;

public class Giyeol11054 {

	public static void main(String[] args) {
		
		        Scanner scan = new Scanner(System.in);

		        int n = scan.nextInt();
		        int[] arr = new int[n + 1];
		        for (int i = 1; i <= n; i++) {
		            arr[i] = scan.nextInt();
		        }

		        int[] dpLR = new int[n + 1];
		        for (int i = 1; i <= n; i++) {
		            dpLR[i] = 1;
		            for (int j = 1; j < i; j++) {
		                if (arr[i] > arr[j]) {
		                    dpLR[i] = Math.max(dpLR[j] + 1, dpLR[i]);
		                }
		            }
		        }

		        int[] dpRL = new int[n + 1];
		        for (int i = n; i > 0; i--) {
		            dpRL[i] = 1;
		            for (int j = n; j > i; j--) {
		                if (arr[i] > arr[j]) {
		                    dpRL[i] = Math.max(dpRL[j] + 1, dpRL[i]);
		                }
		            }
		        }

		        int max = 0;
		        for (int i = 1; i <= n; i++) {
		            max = Math.max(max, dpLR[i] + dpRL[i]);
		        }
		        
		        System.out.println(max - 1); 
		    }
		}