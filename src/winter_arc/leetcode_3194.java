package winter_arc;
import java.util.*;
public class leetcode_3194 {
    public static void main(String[] args) {
        int[] nums={7,8,3,4,15,13,4,1};
        System.out.println(minimumAverage(nums));
    }
    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double ans=Integer.MAX_VALUE;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            double avg=(nums[left]+nums[right])/2.0;
            ans=Math.min(avg,ans);
            left++;
            right--;
        }
        return ans;
    }
}
