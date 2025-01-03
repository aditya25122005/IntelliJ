package winter_arc;
import java.util.*;
public class leetcode_611 {
    public static void main(String[] args) {
        int [] nums={2,2,3,4};
        System.out.println(triangleNumber(nums));
    }
    public static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=0;
        for(int i=n-1;i>1;i--){

            int right=i-1;
            int left=0;
            while(left<right){
                if(nums[left]+nums[right]>nums[i]){
                    count+=(right-left);
                    right--;
                }

                else{
                    left++;
                }

            }

        }
        return count;

    }
}
