package assignment3_CB;

import java.util.*;
import java.util.*;
public class calculate_the_sum {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int mod=1000000007;
        int N=sc.nextInt();
        int [] arr =new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int Q=sc.nextInt();
        for(int i=1;i<=Q;i++){
            int x=sc.nextInt();
            int temp[] =new int[N];

            for(int j=0;j<x;j++){
                temp[j]=(arr[j]+arr[(N-x+j)%N]) % mod;
            }
            for(int j=x;j<N;j++){
                temp[j]=(arr[j]+arr[j-x])% mod;
            }
            arr=temp;
        }
        int s=0;
        for(int i=0;i<N;i++){
            s+=arr[i];
        }
        System.out.println(s%mod);

    }
}