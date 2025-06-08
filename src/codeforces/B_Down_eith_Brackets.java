package codeforces;

import java.util.Scanner;

public class B_Down_eith_Brackets {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            String s=sc.next();
            int n=s.length();
            int open=0;
            int close=0;
            while(open<n && s.charAt(open)=='('){
                open++;
            }
            while(close<n && s.charAt(n-1-close)==')'){
                close++;
            }
            if(open==n/2 && close==n/2){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
