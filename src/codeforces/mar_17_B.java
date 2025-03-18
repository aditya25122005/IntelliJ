package codeforces;

import java.util.Scanner;
import java.util.Arrays;

public class mar_17_B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int t=1;t<=T;t++){
           int n=sc.nextInt();
           int k=sc.nextInt();
           int [] arr=new int[n];
           for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
           }
           Arrays.sort(arr);
           int ans=0;
           for(int i=n-k;i<n;i++){
               ans+=arr[i];
           }
           int lastPainted = (n - k > 0) ? arr[n - k - 1] : arr[n - 1];
           System.out.println(lastPainted+ans);
       }
       sc.close();

    }
}
