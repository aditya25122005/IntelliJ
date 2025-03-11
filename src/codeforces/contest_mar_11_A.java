package codeforces;

import java.util.Scanner;

public class contest_mar_11_A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int d=sc.nextInt();
            int u=sc.nextInt();

            if(l==r && r==u && u==d && d==l){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
