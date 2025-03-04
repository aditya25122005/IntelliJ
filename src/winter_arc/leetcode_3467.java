package winter_arc;
import java.util.*;
public class leetcode_3467 {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        System.out.println(transformArray(nums));
    }
    public static int[] transformArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}
