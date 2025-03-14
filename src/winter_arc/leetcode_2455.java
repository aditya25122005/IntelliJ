package winter_arc;

public class leetcode_2455 {
    public static void main(String[] args) {
        int [] nums={1,3,6,10,12,15};
        System.out.println(averageValue(nums));
    }
    public static int averageValue(int[] nums) {
        int count=0;
        int sum=0;
        for(int num:nums){
            if(num%6==0){
                sum+=num;
                count++;
            }
        }
        return (count==0) ? 0 : sum/count;

    }
}
