package winter_arc;

public class max_avg_subarray {
    public static void main(String[] args) {
       int [] nums = {1,12,-5,-6,50,3};
       int k = 4;
        System.out.println(findMaxAverage(nums,k));

    }
    public static double findMaxAverage(int[] nums, int k) {
        double sum=0;

        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxavg=sum/k;


        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];

            maxavg=Math.max(maxavg,sum/k);
        }

        return maxavg;
    }
}
