package winter_arc;
import java.util.*;
public class leetcode_274_H_Index {
    public static void main(String[] args) {
        int [] citations={3,0,6,1,5};
        System.out.println(hIndex(citations));
    }
    public static int hIndex(int[] citations) {
        int n=citations.length;
        Arrays.sort(citations);
        int lo=0;
        int hi=n-1;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(citations[mid]==n-mid){
                ans=n-mid;
                return ans;
            }
            else if(citations[mid]<n-mid){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return n-lo;

    }
}
