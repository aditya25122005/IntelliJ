package practice;

public class leetcode_69_sqrt {
    public static void main(String[] args) {
        int x=8;
        System.out.println(mySqrt(x));

    }
    public static int mySqrt(int x) {
        int lo=1;
        int hi=x;
        int ans=1;
        if(x==0){
            return 0;
        }
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if((long)mid*mid <= x){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }

        }
        return ans;

    }
}
