package practice;

public class leetcode_81_searchInRotatedArr {
    public static void main(String[] args) {
        int [] nums={2,5,6,0,0,1,2};
        int target=0;
        System.out.println(search(nums,target));
    }


    public static  boolean search(int[] nums, int target) {

        int lo=0;
        int hi=nums.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[lo]==nums[mid] && nums[mid]==nums[hi]){
                lo++;
                hi--;
            }

            else if(nums[lo]<=nums[mid]){
                if(nums[lo]<=target && target<nums[mid]){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
            else{
                if(nums[hi]>=target && nums[mid]<target){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
        }
        return false;
}
}