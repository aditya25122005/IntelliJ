package winter_arc;

public class leetcode_2874 {
    public static void main(String[] args) {
        int [] nums={12,6,1,2,7};
        System.out.println(maximumTripletValue(nums));
    }
    public static long maximumTripletValue(int[] nums) {
        int n= nums.length;
        int[] left= new int [n];
        int[] right= new int [n];
        left[0]=nums[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],nums[i]);
        }
        right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],nums[i]);
        }
        long ans=0;
        for(int i=1;i<n-1;i++){
            int l=left[i-1];
            int r=right[i+1];
            ans=(long)Math.max(ans,(long)(l-nums[i])* (long)r);
        }
        return ans;
    }
}
