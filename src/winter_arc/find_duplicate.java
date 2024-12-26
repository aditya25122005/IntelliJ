package winter_arc;
import java.util.*;
public class find_duplicate {
    public static void main(String[] args) {

    }
    public static  int findDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        HashSet<Integer> hh=new HashSet<>();
        for(int ele:nums){
            if(!hh.add(ele)){
                return ele;
            }
        }
        return -1;
    }
}
