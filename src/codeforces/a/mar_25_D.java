package codeforces.a;

import java.util.Scanner;
public class mar_25_D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            long n=sc.nextLong();
            long m=sc.nextLong();
            long k=sc.nextLong();
            long ans=(k+n-1)/n;
            if (k <= n) {
                System.out.println(1);
            } else if (k >= n * m) {
                System.out.println(m);
            } else {
                long benchLength = (k % n == 0) ? (k / n) : (k / n + 1);
                System.out.println(benchLength);
            }

        }

    }
}
