package winter_arc;
import java.util.*;
public class leetcode_3225 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int threshold=2;
        System.out.println(stableMountains(nums,threshold));
    }
    public static List<Integer> stableMountains(int[] nums, int threshold) {
        List<Integer> ll=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i-1]>threshold){
                ll.add(i);
            }
        }
        return ll;
    }
}
