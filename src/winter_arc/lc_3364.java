package winter_arc;

import java.util.ArrayList;

public class lc_3364 {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(3);
        nums.add(-2);
        nums.add(1);
        nums.add(4);
        System.out.println(minimumSumSubarray(nums,2,3));
    }
    public static int minimumSumSubarray(ArrayList<Integer> nums, int l, int r) {
        int n=nums.size();
        int ans=Integer.MAX_VALUE;
        int [] prefixSum=new int[n+1];
        for(int i=0;i<n;i++){
            prefixSum[i+1]=prefixSum[i]+nums.get(i);
        }
        for(int len=l;len<=r;len++){

            for(int i=0;i+len<=n;i++){
                int sum=prefixSum[i+len]-prefixSum[i];
                if(sum>0){
                    ans=Math.min(ans,sum);
                }
            }
        }
        return ans==Integer.MAX_VALUE? -1:  ans;
    }
}
