package practice;
import java.util.*;
public class max_sum_arr {
    public static void main(String[] args) {
        int [] arr={8 ,-8, 9 ,-9 ,10 ,-11 ,12};
        System.out.println(max_circular_sum(arr));
    }
//GENERATE MAX SUBARRAY SUM USING KARDANES
    public static int max_subarray(int [] arr){
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            ans=Math.max(sum,ans);
            if(sum<0){
                sum=0;
            }

        }
        return ans;

    }
    public static int max_circular_sum(int[] arr){
        int N=arr.length;
        int total=0;
        int max_kardane=max_subarray(arr);
        for(int i=0;i<N;i++){
            total+=arr[i];
            arr[i]=-arr[i];
        }
        //min_subarraysum
        int max_wrap=total+max_subarray(arr);
        if(max_wrap==0){
            return max_kardane;
        }
        return Math.max(max_wrap,max_kardane);



    }
}
