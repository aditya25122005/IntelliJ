package winter_arc;

public class leetcode_2161 {
    public static void main(String[] args) {
        int [] nums={9,12,5,10,14,3,10};
        int pivot=10;
        System.out.println(pivotArray(nums,pivot));
    }
    public static int[] pivotArray(int[] nums, int pivot) {
        int [] ans= new int[nums.length];
        int idx=0;
        for(int num:nums){
            if(num<pivot){
                ans[idx]=num;
                idx++;
            }
        }
        for(int num:nums){
            if(num==pivot){
                ans[idx]=pivot;
                idx++;
            }
        }
        for(int num:nums){
            if(num>pivot){
                ans[idx]=num;
                idx++;
            }

        }
        return ans;

    }
}
