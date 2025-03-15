package winter_arc;

public class leetcode_2560 {
    public static void main(String[] args) {
        int [] nums={2,7,9,3,1};
        int k=2;
        System.out.println(minCapability(nums,k));
    }
    public static int minCapability(int[] nums, int k) {
        int lo=Integer.MAX_VALUE;
        int hi=Integer.MIN_VALUE;
        for(int num:nums){
            lo=Math.min(lo,num);
            hi=Math.max(hi,num);

        }
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(isitpossible(nums,k,mid)){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return lo;
    }
    public static boolean isitpossible(int [] nums, int k, int mid){
        int count=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]<=mid){
                count++;
                i+=2;
            }
            else{
                i++;
            }
        }
        return count>=k;
    }
}
