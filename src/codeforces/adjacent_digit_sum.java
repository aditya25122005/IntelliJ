package codeforces;

import java.util.Scanner;

public class adjacent_digit_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int n=1;
            boolean b=false;
            while(n<1_000_000){
                if(sumOfDigit(n)==x && sumOfDigit(n+1)==y){

                    System.out.println("Yes");
                    b=true;
                    break;

                }

                n++;
            }
            if(b==false) {
                System.out.println("No");
            }

        }
    }
    public static long sumOfDigit(long num){
        long sum=0;
        while(num!=0){
            long rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
}
