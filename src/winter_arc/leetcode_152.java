package winter_arc;

public class leetcode_152 {
    public static void main(String[] args) {
        int [] nums={-1,-2,-4};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int curr=1;
        for(int num:nums){
            curr*=num;
            max=Math.max(curr,max);
            if(curr==0){
                curr=1;
            }
        }
        curr=1;
        // max=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            curr*=nums[i];
            max=Math.max(curr,max);
            if(curr==0){
                curr=1;
            }
        }
        return max;
    }
}
