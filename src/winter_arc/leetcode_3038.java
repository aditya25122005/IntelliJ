package winter_arc;

public class leetcode_3038 {
    public static void main(String[] args) {
        int [] nums={3,2,1,4,5};
        System.out.println(maxOperations(nums));
        int [] arr1={1,2,3};
        int [] arr2={4,5,6};
        arr1=arr2;
        System.out.println(arr1[1]);
    }
    public static int maxOperations(int[] nums) {
        int count=1;
        int isum=nums[0]+nums[1];
        int limit= (nums.length%2==0) ? nums.length-2 : nums.length-3;
        for(int i=2;i<=limit;i+=2){
            int sum=nums[i]+nums[i+1];
            if(sum==isum){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
