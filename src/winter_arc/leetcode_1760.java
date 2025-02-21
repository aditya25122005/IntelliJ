package winter_arc;

public class leetcode_1760 {
    public static void main(String[] args) {
        int [] nums={2,4,8,2};
        int maxOperations=4;
        System.out.println(minimumSize(nums,maxOperations));
    }
    public static int minimumSize(int[] nums, int maxOperations) {
        int max=0;
        for(int num:nums){
            max=Math.max(max,num);
        }
        int lo=1;
        int hi=max;
        int ans=max;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            long Opr=0;
            for(int num:nums){
                Opr+= (num-1)/mid;
            }
            if(Opr<=maxOperations){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }

        }
        return ans;
    }
}
