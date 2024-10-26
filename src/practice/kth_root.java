package practice;

public class kth_root {
    public static void main(String[] args) {
        int N=46;
        int k=3;
        System.out.println(kth(N,k));

    }
    public static int kth(int N,int k){
        int lo=1;
        int hi=N;
        int ans=Integer.MIN_VALUE;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(Math.pow(mid,k)<=N){
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
