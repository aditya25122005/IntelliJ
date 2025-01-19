package winter_arc;

public class leetcode_22210 {
    public static void main(String[] args) {
        int [] nums={2,4,1,1,6,5};
        System.out.println( countHillValley(nums));
    }
    public static int countHillValley(int[] nums) {

        int count=0;
        int num=nums[0];
        for(int i=1;i<nums.length-1;i++){
            if(num<nums[i] && nums[i]>nums[i+1]  || num>nums[i] && nums[i]<nums[i+1]){
                count++;
                num=nums[i];
            }
        }
        return count;

    }
}
