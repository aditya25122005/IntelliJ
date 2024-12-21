package winter_arc;
import java.util.*;
public class lc_594_longestHarmonicalSeq {
    public static void main(String[] args) {
        int nums[]={1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
    public static int findLHS(int[] nums) {
        Arrays.sort(nums);
        int si=0;
        int ei=1;
        int maxlen=0;
        while(ei<nums.length){
            int diff=nums[ei]-nums[si];
            if(diff==1){
                maxlen=Math.max(maxlen,ei-si+1);
            }
            if(diff<=1){
                ei++;
            }
            else{
                si++;
            }


        }
        return maxlen;
    }
}
