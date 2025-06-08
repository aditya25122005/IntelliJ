package codeforces.contest_8_june;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int n=sc.nextInt();
            int [] arr= new int[n+2];

            int [] next=new int [n+2];

            int [] last=new int [n+2];
            for(int i=1;i<=n;i++){
                arr[i]=sc.nextInt();
            }
            int inf=n+1;
            Arrays.fill(last,inf);

            for (int i = n; i >= 1; i--) {
                next[i] = last[arr[i]];
                last[arr[i]] = i;
            }
            int pos = 1;
            int count = 0;

            while (pos <= n) {
                int end = pos;
                while (true) {
                    int nn = 0;
                    for (int i = pos; i <= end; i++) {
                        nn = Math.max(nn, next[i]);
                    }
                    count++;
                    if (nn > n) break;
                    pos = end + 1;
                    end = nn;
                }
                break;
            }
            System.out.println(count);
        }
    }
}
