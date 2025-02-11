package winter_arc;
import java.util.*;
public class leetcode_1913 {
    public static void main(String[] args) {
        int [] nums={5,6,2,7,4};
        System.out.println(maxProductDifference(nums));
    }
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return  (nums[nums.length-1]*nums[nums.length-2]) -  (nums[0]*nums[1]) ;

    }
}
