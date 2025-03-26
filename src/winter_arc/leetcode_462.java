package winter_arc;
import java.util.*;
public class leetcode_462 {
    public static void main(String[] args) {
        int [] nums={1,2,3};
        System.out.println(minMoves2(nums));
    }
    public static int minMoves2(int[] nums) {
        int n=nums.length;
        int sum=0;
        int opr=0;
        int median=0;
        for(int num:nums){
            sum+=num;
        }
        Arrays.sort(nums);
        if (n % 2 != 0){
            median=(int)(nums[n / 2]);
        }
        else{

            median=(int)((nums[(n - 1) / 2] + nums[n / 2]) / 2);
        }
        for(int num:nums){
            opr+=Math.abs(num-median);
        }
        return opr;
    }
}
