package codeforces;

import java.util.Scanner;

public class contest_mar_11_C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int x=sc.nextInt();
            boolean flag=false;
            for(int i=x-1;i>=1;i--){
                int a=x;
                int b=i;
                int c=a^b;
                if(c>0 && a+b>c && b+c>a && a+c>b){
                    System.out.println(b);
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(-1);
            }
        }

    }
}
