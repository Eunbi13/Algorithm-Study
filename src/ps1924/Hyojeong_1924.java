package ps1924;

import java.util.Scanner;

public class Hyojeong_1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mdays = new int[13];
        mdays[1] = mdays[3] = mdays[5] = mdays[7] = mdays[8] = mdays[10] = mdays[12] = 31;
         mdays[4] = mdays[6] = mdays[9] = mdays[11] = 30;
         mdays[2] = 28;
         															//끝나는 일에 따라 배열에 넣어줌
        int M = sc.nextInt();
        int D = sc.nextInt();
        
        int totalDay = 0;
        
        for(int month=1; month < M; month++) {
            if(M == 1) {
                
                break;
            }
            
            totalDay += mdays[month];
        }
        totalDay += D;
        int result = totalDay % 7;
        switch(result) {
            case 1:
                System.out.println("MON");
                break;
            
            case 2:
                System.out.println("TUE");
                break;
                
            case 3:
                System.out.println("WED");
                break;
                
            case 4:
                System.out.println("THU");
                break;
                
            case 5:
                System.out.println("FRI");
                break;
                
            case 6:
                System.out.println("SAT");
                break;
                
            case 0:
                System.out.println("SUN");
                break;
        }
    }
    
}
