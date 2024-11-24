package practice;

public class leetcode_209 {
    public static void main(String[] args) {
        int [] nums={2,3,1,2,4,3};
        int target=7;
        System.out.println(minSubArrayLen(target,nums));

    }
    public static int minSubArrayLen(int target, int[] nums) {
        int minLen=Integer.MAX_VALUE;
        int lo=0;
        int currSum=0;
        int hi=0;
        while(hi<nums.length){
            currSum+= nums[hi++];

            while(currSum>=target){
                minLen =Math.min(minLen,hi-lo);
                currSum-=nums[lo++];
            }
        }
        return minLen==Integer.MAX_VALUE? 0: minLen;

    }
}
