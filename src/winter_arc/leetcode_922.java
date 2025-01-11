package winter_arc;

public class leetcode_922 {
    public static void main(String[] args) {
        int[] nums={4,2,5,7};
        System.out.println(sortArrayByParityII(nums));
    }
    public static int[] sortArrayByParityII(int[] nums) {
        int [] ans=new int[nums.length];
        int [] odd=new int[nums.length/2];
        int [] even=new int[nums.length/2];
        int ei=0;
        int oi=0;
        for(int e:nums){
            if(e%2==0){
                even[ei]=e;
                ei++;
            }
            else{
                odd[oi]=e;
                oi++;
            }
        }
        int eidx=0;
        int oidx=0;

        for(int i=0;i<nums.length-1;i+=2){
            ans[i]=even[eidx];
            eidx++;
        }
        for(int i=1;i<nums.length;i+=2){
            ans[i]=odd[oidx];
            oidx++;
        }

        return ans;
    }
}
