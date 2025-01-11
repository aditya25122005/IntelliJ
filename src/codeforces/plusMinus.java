package codeforces;

import java.util.Scanner;

public class plusMinus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a+b==c){
                System.out.println('+');
            }
            else{
                System.out.println('-');
            }
        }
    }
}
