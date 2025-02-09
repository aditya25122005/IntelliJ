package winter_arc;

public class leetcode_31 {
    public static void main(String[] args) {
        int [] nums={1,2,3};
        nextPermutation(nums);
    }
    public static void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

        Reverse(nums,i+1);
    }
    public static void Reverse(int [] nums,int str){
        int end=nums.length-1;
        while(str<end){
            int temp=nums[str];
            nums[str]=nums[end];
            nums[end]=temp;
            str++;
            end--;
        }
    }
}
