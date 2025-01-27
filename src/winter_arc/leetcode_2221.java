package winter_arc;

public class leetcode_2221 {
    public static void main(String[] args) {

        int [] nums={1,2,3,4,5};
        System.out.println(triangularSum(nums));
    }
    public static int triangularSum(int[] nums) {

        int n=nums.length;
        while(n>1){
            for(int i=0;i<nums.length-1;i++){
                nums[i]=(nums[i]+nums[i+1])%10;

            }
            nums[n-1]=0;
            n--;
        }
        return nums[0];
    }
}
