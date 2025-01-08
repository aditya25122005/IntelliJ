package winter_arc;

public class leetcode_2270 {
    public static void main(String[] args) {
        int nums[]={10,4,-8,7};
        System.out.println(waysToSplitArray(nums));
    }
    public static int waysToSplitArray(int[] nums) {
        int c=0;
        int n=nums.length;
        long totalSum=0;
        for(int val:nums){
            totalSum+=val;
        }
        long leftsum=0;
        for(int i=0;i<n-1;i++){
            leftsum+=nums[i];
            long rightsum=totalSum-leftsum;

            if(leftsum>=rightsum){
                c++;
            }
        }
        return c;
    }
}
