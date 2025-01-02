package winter_arc;

public class leetcode_275 {
    public static void main(String[] args) {
        int [] citations={0,1,3,5,6};
        System.out.println(hIndex(citations));
    }
    public static int hIndex(int[] citations) {
        int n=citations.length;
        int lo=0;
        int hi=n-1;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(citations[mid]==n-mid){
                ans=n-mid;
                return ans;
            }
            else if(citations[mid]<n-mid){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return n-lo;

    }
}
