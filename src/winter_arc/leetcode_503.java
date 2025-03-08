package winter_arc;
import java.util.Stack;
public class leetcode_503 {
    public static void main(String[] args) {
        int [] nums={1,2,1};
        System.out.println(nextGreaterElements(nums));
    }
    public static int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int [] ans=new int [nums.length];


        for(int i=0;i<2*n;i++){
            while(!st.isEmpty() && nums[i%n]>nums[st.peek()]){
                ans[st.pop()]=nums[i%n];
            }
            if(i<n){
                st.push(i);
            }
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        return ans;

    }
}
