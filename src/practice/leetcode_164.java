package practice;
import java.util.*;
public class leetcode_164 {
    public static void main(String[] args) {
        int [] nums={3,6,9,1};
        System.out.println(maximumGap(nums));

    }
    public static int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i] >= max){
                max=nums[i+1]-nums[i];
            }
        }
        return max;

    }
}
