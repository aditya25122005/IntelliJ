package winter_arc;

public class leetcode_55 {
    public static void main(String[] args) {
        int [] nums={2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i>max){
                return false;
            }
            max=Math.max(max,i+nums[i]);
            if(max>=nums.length-1){
                return true;
            }
        }
        return false;
    }
}
