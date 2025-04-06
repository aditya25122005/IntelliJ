package winter_arc;
import java.util.*;
public class leetcode_456 {
    public static void main(String[] args) {
        int [] nums={1,3,2};
        System.out.println(find132pattern(nums));
    }
    public static boolean find132pattern(int[] nums) {
        Stack<Integer> st= new Stack<>();
        int second=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<second){
                return true;
            }
            while(!st.isEmpty() && st.peek()<nums[i]){
                second=st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}
