package practice;

import java.util.*;
import java.lang.*;

public class prime_generator
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            for(int i=x;i<=y;i++){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int n){
        boolean b=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                b=false;
            }
        }
        return b;
    }
}