package winter_arc;

public class leetcode_2226 {
    public static void main(String[] args) {
        int [] arr={5,8,6};
        int k=3;
        System.out.println(maximumCandies(arr,k));
    }
    public static int maximumCandies(int[] arr, long k) {
        int max=0;
        long candySum=0;

        for(int num:arr){
            candySum+=num;
            max=Math.max(max,num);
        }
        int ans=0;
        if(candySum<k){
            return 0;
        }
        int lo=1;
        int hi=max;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            long sum=0;
            for(int num:arr){
                sum+= num/mid;
            }
            if(sum>=k){
                ans=Math.max(ans,mid);
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }

        }
        return ans;

    }
}
