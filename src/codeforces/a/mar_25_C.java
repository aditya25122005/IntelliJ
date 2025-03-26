package codeforces.a;

import java.util.Scanner;

public class mar_25_C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int N=sc.nextInt();
            if(N%2==0){
                System.out.println(-1);
                continue;
            }
            int [] perm=new int[N];
            for(int i=1;i<=N;i++){
                perm[i-1]=((2*(i-1))%N)+1;
            }
            for(int i=0;i<N;i++){
                System.out.print(perm[i]+" ");

            }
            System.out.println();
        }
    }
}
