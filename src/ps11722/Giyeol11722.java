package week7.ps11722;

import java.util.Scanner;

public class Giyeol11722 {
	public static void main(String[] args) {
		

Scanner scan = new Scanner(System.in);

int n = scan.nextInt();
int arr[] = new int[n + 1];
int d[] = new int[n + 1];

for (int i = 1; i <= n; i++)
    arr[i] = scan.nextInt();

d[1] = 1;

for (int i = 2; i <= n; i++) {
    d[i] = 1;
    for (int j = 0; j < i; j++) {
        if (arr[i] < arr[j] && d[i] <= d[j]) {
            d[i] = d[j] + 1;
        } else if (arr[i] == arr[j]) {
            d[i] = d[j];
        }
    }
}

int max = 0;

for (int i = 1; i <= n; i++)
    max = Math.max(d[i], max);

System.out.println(max);

scan.close();
}
}