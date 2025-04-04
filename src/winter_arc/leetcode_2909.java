package winter_arc;

public class leetcode_2909 {
    public static void main(String[] args) {
        int [] nums={8,6,1,5,3};
        System.out.println(minimumSum(nums));
    }
    public static int minimumSum(int[] nums) {
        int n = nums.length;
        int [] left= new int [n];
        int [] right= new int [n];
        left[0]=nums[0];
        for(int i=1;i<n;i++){
            left[i]=Math.min(left[i-1],nums[i]);
        }
        right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.min(right[i+1],nums[i]);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<n-1;i++){
            if (left[i-1] < nums[i] && right[i+1] < nums[i]) {
                ans = Math.min(ans, left[i-1] + nums[i] + right[i+1]);
            }
        }
        return ans==Integer.MAX_VALUE? -1 :ans;
        //Hint 1
// If you fix index j, i will be the smallest integer to the left of j, and k the largest integer to the right of j.

    }
}
