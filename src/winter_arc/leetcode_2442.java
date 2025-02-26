package winter_arc;
import java.util.*;
public class leetcode_2442 {
    public static void main(String[] args) {
        int [] nums={1,13,10,12,31};
        System.out.println(countDistinctIntegers(nums));
    }
    public static int countDistinctIntegers(int[] nums) {
        HashSet<Integer> h1=new HashSet<>();
        for(int num:nums){
            h1.add(num);
        }
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            int r=0;
            while(val!=0){
                int rem=val%10;
                r = r*10 +rem;
                val/=10;
            }
            h1.add(r);
        }
        return h1.size();
    }
}
