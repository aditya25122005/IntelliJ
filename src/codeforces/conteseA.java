package codeforces;

import java.util.Scanner;

public class conteseA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            int a4=sc.nextInt();
            int a5=sc.nextInt();

            int a31= a5-a4;
            int a32=a1+a2;
            int a33=a4-a2;

            int maxCount=0;
            maxCount=Math.max(maxCount,check(a1,a2,a31,a4,a5));
            maxCount=Math.max(maxCount,check(a1,a2,a32,a4,a5));
            maxCount=Math.max(maxCount,check(a1,a2,a33,a4,a5));

            System.out.println(maxCount);

        }


    }
    public static int  check(int a1,int a2,int a3,int a4,int a5){
        int count=0;
        if(a1+a2==a3) count++;
        if(a2+a3==a4) count++;
        if(a3+a4==a5) count++;
        return count;
    }
}
