package winter_arc;
import java.util.*;
public class leetcode_2563 {
    public static void main(String[] args) {
        int [] nums={0,1,7,4,4,5};
        int lower=3;
        int upper=6;
        System.out.println(countFairPairs(nums,lower,upper));
    }
    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return getlessThanVal(nums,upper+1) -getlessThanVal(nums,lower);
    }
    public static long getlessThanVal(int [] nums, int val){
        int left=0;
        int right=nums.length-1;
        long res=0;;
        while(left<=right){
            if(nums[left]+nums[right] < val){
                res+= right-left;
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
}
