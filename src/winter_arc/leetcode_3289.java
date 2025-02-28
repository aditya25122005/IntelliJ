package winter_arc;
import java.util.*;
public class leetcode_3289 {
    public static void main(String[] args) {
        int [] nums={0,1,1,0};
        System.out.println(getSneakyNumbers(nums));
    }
    public static int[] getSneakyNumbers(int[] nums) {
        int [] ans=new int[2];
        int idx=0;

        HashSet<Integer> h1=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(h1.contains(nums[i])){
                ans[idx++]=nums[i];
            }
            h1.add(nums[i]);
        }
        return ans;
    }
}
