package practice;
import java.util.*;
public class leetcode_217 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,4};
        System.out.println(containsDuplicate(nums));


    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int ele:nums){
            if(h.contains(ele)) return true;
            h.add(ele);

        }
        return false;
    }
}
