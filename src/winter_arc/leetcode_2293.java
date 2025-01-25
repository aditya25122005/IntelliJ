package winter_arc;

public class leetcode_2293 {
    public static void main(String[] args) {
        int [] nums={1,3,5,2,4,8,2,2};
        System.out.println(minMaxGame(nums));
    }
    public static int minMaxGame(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }

        while(nums.length>1){
            int n=nums.length;
            int [] newNums=new int[n/2];
            for(int i=0;i<newNums.length;i++){
                if(i%2==0){
                    newNums[i]=Math.min(nums[2*i],nums[2*i +1]);
                }
                else{
                    newNums[i]=Math.max(nums[2*i],nums[2*i +1]);
                }
            }
            nums=newNums;
        }
        return nums[0];
    }
}
