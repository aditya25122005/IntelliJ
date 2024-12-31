package winter_arc;

public class leetcode_2149 {
    public static void main(String[] args) {
        int [] nums={3,1,-2,-5,2,-4};
        System.out.println(rearrangeArray(nums));
    }
    public static int[] rearrangeArray(int[] nums) {
        int [] result=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                result[neg]=nums[i];
                neg+=2;
            }
            else{
                result[pos]=nums[i];
                pos+=2;
            }
        }
        return result;
    }
}
