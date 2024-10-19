package codeforces;

import java.util.*;
public class sum{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            if(a+b==c || b+c==a || a+c==b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }


    }
}