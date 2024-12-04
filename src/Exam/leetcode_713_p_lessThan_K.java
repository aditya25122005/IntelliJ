package Exam;

public class leetcode_713_p_lessThan_K {
    public static void main(String[] args) {
       int [] nums = {10,5,2,6};
        int  k = 100;
        int ans=0;
        int p=1;
        int si=0;
        int ei=0;
        while(ei<nums.length){
            p*=nums[ei];
            while(p>=k && si<=ei){
                p=p/nums[si];
                si++;
            }
            ans+= ei-si+1;
            ei++;
        }
        System.out.println(ans);
    }
}
