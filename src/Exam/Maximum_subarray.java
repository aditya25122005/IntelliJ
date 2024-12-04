package Exam;

public class Maximum_subarray {
    public static void main(String[] args) {
        int [] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));

    }
    public static int maxSubArray(int[] nums) {
        int N=nums.length;
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ans=Math.max(sum,ans);
            if(sum<0){
                sum=0;

            }

        }
        return ans;

    }
}
