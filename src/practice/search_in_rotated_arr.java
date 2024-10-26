package practice;

public class search_in_rotated_arr {
    public static void main(String[] args) {
        int [] nums={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(nums,target));

    }



public static int search(int[] nums, int target) {
    int lo=0;
    int hi=nums.length-1;
    while(lo<=hi){
        int mid=(lo+hi)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[lo]<=nums[mid]){  //first half is sorted
            if(nums[lo]<=target && target<=nums[mid]){
                hi=mid-1;

            }
            else{
                lo=mid+1;
            }
        }
        else{
            if(nums[mid]<=target && target<=nums[hi]){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
    }
    return -1;
}}