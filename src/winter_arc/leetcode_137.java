package winter_arc;
import java.util.*;
public class leetcode_137 {
    public static void main(String[] args) {
        int [] nums={1,1,1,2,3,3};
        System.out.println(singleNumber(nums));

    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<=1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[i+1]!= nums[i]){
                    return nums[i];
                }
            }
            else if(i==nums.length-1){
                if(nums[i-1]!= nums[i]){
                    return nums[i];
                }
            }
            else{
                if(nums[i+1] != nums[i] && nums[i-1] != nums[i]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
