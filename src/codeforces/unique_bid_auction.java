package codeforces;
import java.util.*;
public class unique_bid_auction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int N=sc.nextInt();
            int [] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            int [] count=new int[N+1];
            for(int ele:arr){
                count[ele]++;
            }
            int min_unique=Integer.MAX_VALUE;
            for(int i=1;i<=N;i++){
                if(count[i]==1 && i<=min_unique){
                    min_unique=i;
                }
            }
            if(min_unique==Integer.MAX_VALUE){
                System.out.println(-1);
            }
            else {
                for (int i = 0; i < N; i++) {
                    if (arr[i] == min_unique) {
                        System.out.println(i + 1);
                    }
                }
            }
        }

    }
}
