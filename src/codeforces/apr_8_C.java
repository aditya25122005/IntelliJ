package codeforces;

import java.util.Scanner;

public class apr_8_C {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            long x = sc.nextLong();
            int k=sc.nextInt();
            solve(x,k);
        }
    }
    public static void solve(long x, int k){
        if(k==1){
            System.out.println(isPrime(x) ? "YES" : "NO");
        }
        else{
            if(x==1  && k==2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean isPrime(long n){
        if(n<2) return false;
        for(long i=2;i*i <=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
