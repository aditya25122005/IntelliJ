package ass_4;

import java.util.*;
public class kth_root {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            long N=sc.nextLong();
            int k=sc.nextInt();

            long lo=1;
            long hi=N;
            long ans=0;
            while(lo<=hi){
                long mid=lo+(hi-lo)/2;
                if(Math.pow(mid,k)<=N){
                    ans=mid;
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
            System.out.println(ans);
        }
    }
}
