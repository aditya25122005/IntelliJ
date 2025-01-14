package winter_arc;

public class leetcode_3300 {
    public static void main(String[] args) {
        int nums[]={11,22,33,44};
        System.out.println(minElement(nums));
    }
    public static int minElement(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int curr=0;
            while(num!=0){
                int rem=num%10;
                curr+=rem;
                num/=10;
            }
            ans=Math.min(ans,curr);
        }
        return ans;

    }
}
