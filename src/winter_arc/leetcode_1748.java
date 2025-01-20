package winter_arc;

public class leetcode_1748 {
    public static void main(String[] args) {
        int [] nums={1,4,2,2};
        System.out.println(sumOfUnique(nums));
    }
    public static int sumOfUnique(int[] nums) {
        int [] freq=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int ans=0;

        for(int i=0;i<freq.length;i++){
            if(freq[i]==1){
                ans+=freq[i] *i;
            }
        }
        return ans;

    }
}
