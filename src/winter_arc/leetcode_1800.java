package winter_arc;

public class leetcode_1800 {
    public static void main(String[] args) {
        int [] nums={10,20,30,5,10,50};
        System.out.println(maxAscendingSum(nums));
    }
    public static int maxAscendingSum(int[] nums) {
        int maxSum=Integer.MIN_VALUE;;
        int curr=nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]){
                curr+=nums[i+1];
            }
            else{
                maxSum=Math.max(maxSum,curr);
                curr=nums[i+1];
            }
        }
        maxSum=Math.max(curr,maxSum);
        return maxSum;
    }

}
