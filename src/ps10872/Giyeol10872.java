package ps10872;

import java.util.Scanner;

public class Giyeol10872 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int pack = 1;
		int N = scan.nextInt();
		
		if(N == 0) {
			System.out.println(1);
		} else {
			
		
		for(int i = N; i>1; i--) {
			pack = pack*i;
		}
		System.out.println(pack);
		}
	}
}
