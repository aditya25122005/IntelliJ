package winter_arc;
import java.util.*;
public class leetcode_442 {
    public static void main(String[] args) {
        int [] nums={1,2,4,2,5,4};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ll=new ArrayList<>();
        int [] arr=new int[nums.length+1];
        for(int num:nums){
            arr[num]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1){
                ll.add(i);
            }
        }
        return ll;
    }
}
