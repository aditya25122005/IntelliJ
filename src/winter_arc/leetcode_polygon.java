package winter_arc;
import java.util.*;
public class leetcode_polygon {
    public static void main(String[] args) {
        int [] nums={5,5,5};
        System.out.println(largestPerimeter(nums));
    }
    public static long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long ans=-1;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            if(i>=2 && nums[i]<sum){
                ans= sum+nums[i];
            }
            sum+=nums[i];
        }
        return ans;

    }
}
