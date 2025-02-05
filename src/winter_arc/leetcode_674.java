package winter_arc;

public class leetcode_674 {
    public static void main(String[] args) {
        int [] nums={1,3,5,4,7};
        System.out.println(findLengthOfLCIS(nums));
    }
    public static int findLengthOfLCIS(int[] nums) {
        int ei=0;

        int ans=Integer.MIN_VALUE;
        int count=1;

        while(ei<nums.length-1){
            if(nums[ei]<nums[ei+1]){
                count++;
            }
            else{
                ans=Math.max(ans,count);
                count=1;

            }
            ei++;
        }
        ans=Math.max(ans,count);
        return ans;
    }
}
