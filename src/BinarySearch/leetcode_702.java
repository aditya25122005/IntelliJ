package BinarySearch;

public class leetcode_702 {
    public static void main(String[] args) {
        int [] nums={-1,0,3,5,9,12};
        int target=9;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int N=nums.length;
        int lo=0;
        int hi=N-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return -1;

    }
}
