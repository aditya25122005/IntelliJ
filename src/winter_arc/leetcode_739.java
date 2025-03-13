package winter_arc;
import java.util.*;
public class leetcode_739 {
    public static void main(String[] args) {
        int [] arr={73,74,75,71,69,72,76,73};
        System.out.println(dailyTemperatures(arr));
    }
    public static int[] dailyTemperatures(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int [] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                int idx=st.pop();
                ans[idx]=i-idx;
            }
            st.push(i);
        }
        return ans;
    }
}
