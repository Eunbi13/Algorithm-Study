import java.util.Scanner;

public class Mira_1000{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (0 < a && b < 10) {
			System.out.println(a + b);
		}
		
		
		sc.close();
	}
}
