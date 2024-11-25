package practice;
import java.util.*;
public class leetcode_179 {
    public static void main(String[] args) {
        int [] nums={10,2};
        System.out.println(largestNumber(nums));

    }
    public static String largestNumber(int[] nums) {
        String [] arr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(a,b) -> (b+a).compareTo(a+b));
        if(arr[0].equals("0")){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);

        }
        return sb.toString();

    }
}
