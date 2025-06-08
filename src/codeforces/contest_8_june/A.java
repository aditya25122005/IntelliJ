package codeforces.contest_8_june;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int [] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }


            int left = n;
            int right = -1;

            for (int i = 0; i < n; i++) {
                if (arr[i] == 1) {
                    left = Math.min(left, i);
                    right = Math.max(right, i);
                }
            }

            if (right - left + 1 <= x) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
