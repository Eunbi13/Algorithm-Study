package ps1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Jeongwon_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = Integer.parseInt(br.readLine());
        Stack<String> leftstack = new Stack<String>();
        Stack<String> rightstack = new Stack<String>();

        for (int i = 0; i < s.length(); i++) {
            leftstack.push(s.substring(i, i+1));
        }

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("L")) {
                if(leftstack.empty()){
                    continue;
                } else {
                    rightstack.push(leftstack.pop());
                }
            }
            else if(command.equals("D")) {
                if(rightstack.empty()) {
                    continue;
                } else {
                    leftstack.push(rightstack.pop());
                }
            }
            else if(command.equals("B")) {
                if(leftstack.empty()) {
                    continue;
                } else {
                    leftstack.pop();
                }
            }
            else if(command.equals("P")) {
                String add = st.nextToken();
                leftstack.push(add);
            }
        }

        for (int i = 0; i < leftstack.size(); i++) {
            System.out.print("1" + leftstack.get(i));
        }

        for (int i = rightstack.size() - 1; i >= 0; i--) {
            System.out.print(rightstack.get(i));
        }
    }
}
