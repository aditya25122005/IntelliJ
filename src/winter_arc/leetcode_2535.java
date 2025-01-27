package winter_arc;

public class leetcode_2535 {
    public static void main(String[] args) {
        int [] nums={1,15,6,3};
        System.out.println(differenceOfSum(nums));
    }
    public static int differenceOfSum(int[] nums) {
        int digitSum=0;
        int elementSum=0;
        for(int num:nums){
            elementSum+=num;
            while(num!=0){
                int rem=num%10;
                digitSum+=rem;
                num/=10;
            }
        }
        return Math.abs(elementSum-digitSum);
    }
}
