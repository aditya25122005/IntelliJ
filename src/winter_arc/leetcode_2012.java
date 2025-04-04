package winter_arc;

public class leetcode_2012 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(sumOfBeauties(nums));
    }
    public static int sumOfBeauties(int[] nums) {
        int n=nums.length;
        int beauty=0;
        int [] leftMin= new int [n];
        int [] rightMax= new int [n];
        leftMin[0]=nums[0];
        for(int i=1;i<n;i++){
            leftMin[i]=Math.max(nums[i],leftMin[i-1]);
        }
        rightMax[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.min(rightMax[i+1],nums[i]);
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]<rightMax[i+1] && nums[i]>leftMin[i-1]){
                beauty+=2;
            }
            else if(nums[i]<nums[i+1] && nums[i]>nums[i-1]){
                beauty+=1;
            }
        }
        return beauty;
    }
}
