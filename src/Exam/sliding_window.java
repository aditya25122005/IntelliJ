package Exam;

public class sliding_window {
    public static void main(String[] args) {
        int [] arr={2,1,3,4,7,8,9,4,5};
        int k=3;
        int ans=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];

        }
        ans=sum;
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];

            ans=Math.max(sum,ans);
        }
        System.out.println(ans);
    }
}
