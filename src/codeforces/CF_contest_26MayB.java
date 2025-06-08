package codeforces;

import java.util.Scanner;

public class CF_contest_26MayB {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for (int t = 1; t <=T ; t++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int c0=0;

            for(char ch:s.toCharArray()){
                if(ch=='0') {
                    c0++;
                }
            }
            int c1=n-c0;
            int total=n/2;
            int badpair=total-k;

            if(c0<badpair || c1<badpair){
                System.out.println("NO");
                continue;
            }
            int rem0=c0-badpair;
            int rem1=c1-badpair;

            int possible0=rem0/2;
            int possible1=rem1/2;

            int maxGP=possible0+possible1;
            if(maxGP>=k){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
