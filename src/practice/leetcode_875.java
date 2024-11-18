package practice;
import java.util.*;
public class leetcode_875 {
    public static void main(String[] args) {
        int [] piles = {3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(piles,h));

    }
    public static int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);

        int lo=1;
        int hi=piles[piles.length-1];
        int ans=hi;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(isitpossible(mid,piles,h)){
                ans= mid;
                hi=mid-1;

            }
            else {
                lo=mid+1;

            }
        }
        return ans;

    }
    public static boolean isitpossible(int mid,int[] piles,int h){
        int kela=0;
        for(int banana:piles){
            kela+=(banana + mid - 1) / mid;
            if(kela>h) return false;
        }
        return kela<=h;
    }
}
