package ass_4;

import java.util.*;
public class aggr_cow {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int C=sc.nextInt();
        int[] stall=new int[N];
        for(int i=0;i<N;i++){
            stall[i]=sc.nextInt();
        }
        Arrays.sort(stall);
        System.out.println(maximum_min(stall,C));



    }
    public static int maximum_min(int[] stall,int C){
        int lo=0;
        int hi=stall[stall.length-1]-stall[0];
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isitpossible(stall,mid,C)){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int[] stall, int mid, int C){
        int pos=stall[0];
        int cow=1;
        for(int i=1;i<stall.length;i++){
            if(stall[i]-pos>=mid){
                cow++;
                pos=stall[i];
            }
            if(C==cow){
                return true;
            }
        }
        return false;
    }
}