package BinarySearch;

public class leetcode_162 {
    public static void main(String[] args) {
        int [] nums={1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }

        public static int findPeakElement(int[] nums) {
            int n=nums.length;
            int lo=0;
            int hi=n-1;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                if(nums[mid]> (nums[mid-1] & nums[mid+1])){
                    return mid;
                }
                else if(nums[mid+1]>nums[mid]){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
            return -1;

    }
}
