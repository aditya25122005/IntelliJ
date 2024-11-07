package practice;
import java.util.Arrays;
public class first_missing_positive_leetcode {
    public static void main(String[] args) {
        int[] nums={3,4,-1,1};
        System.out.println(firstMissingPositive(nums));

    }
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        //[-1,1,3,4]
        int target=1;
        for(int i: nums){
            if(i>0 && i==target){
                target++;
            }
            else if(i>target){
                return target;
            }
        }
        return target;
    }
}
