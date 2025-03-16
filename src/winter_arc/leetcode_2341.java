package winter_arc;

public class leetcode_2341 {
    public static void main(String[] args) {
        int [] nums={1,3,2,1,3,2,2};
        System.out.println(numberOfPairs(nums));
    }
    public static int[] numberOfPairs(int[] nums) {
        int [] ans=new int [2];
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && (nums[i]!=-1 && nums[j]!=-1)){
                    nums[i]=-1;
                    nums[j]=-1;
                    count++;
                }
            }
        }
        ans[0]=count;
        ans[1]=nums.length-2*count;
        return ans;
    }
}
