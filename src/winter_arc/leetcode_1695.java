package winter_arc;
import java.util.*;
public class leetcode_1695 {
    public static void main(String[] args) {
        int [] nums={4,2,4,5,6};
        System.out.println(maximumUniqueSubarray(nums));
    }
    public static int maximumUniqueSubarray(int[] nums) {
        int ei=0;
        int si=0;
        int curr=0;
        int ans=0;
        HashSet<Integer> h1=new HashSet<>();
        while(ei<nums.length){
            if(h1.add(nums[ei])){
                curr+=nums[ei];
                ans=Math.max(ans,curr);
                ei++;
            }
            else{
                curr-=nums[si];
                h1.remove(nums[si]);
                si++;

            }
        }
        return ans;
    }
}
