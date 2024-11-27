package slidingwindow;

public class maximum_window_sum {
    public static void main(String[] args) {
        int[] arr={2,3,1,1,5,7,8,3,4};
        int k=3;
        System.out.println(Maximum_window(arr,k));



    }
    public static int Maximum_window(int[] arr,int k){
        int sum=0, ans=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        ans=sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]; // grow
            sum-= arr[i-k]; // shrink
            ans=Math.max(ans,sum);

        }
        return ans;
    }

}
