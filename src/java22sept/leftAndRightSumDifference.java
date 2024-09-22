package java22sept;
import java.util.*;

public class leftAndRightSumDifference {
    public static void main(String[] args) {
        int[] arr={10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(arr)));

    }
    public static int[] leftRightDifference(int[] nums) {
        int N=nums.length;
        int [] ans =new int [N];
        int [] left=new int[N];
        int [] right=new int[N];

        left[0]=0;
        for(int i=1;i<N;i++){
            left[i]=left[i-1]+nums[i-1];
        }

        right[N-1]=0;
        for(int i=N-2;i>=0;i--){
            right[i]=right[i+1]+nums[i+1];
        }
        for(int i=0;i<N;i++){
            ans[i]=Math.abs(left[i]-right[i]);
        }
        return ans;
    }
}
