package winter_arc;

public class leetcode_2460 {
    public static void main(String[] args) {
        int [] nums={1,2,2,1,1,0};
        System.out.println(applyOperations(nums));
    }
    public static  int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }
        }
        while(count<nums.length){
            nums[count++]=0;
        }
        return nums;
    }
}
