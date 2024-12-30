package winter_arc;

public class leetcode_540 {
    public static void main(String[] args) {
        int [] nums={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        int lo=0;
        int hi=nums.length-1;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(mid%2==1){
                mid--;
            }

            if(nums[mid] != nums[mid+1]){
                hi=mid;

            }
            else{
                lo=mid+2;
            }

        }
        return nums[lo];
    }
}
