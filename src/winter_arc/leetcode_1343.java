package winter_arc;

public class leetcode_1343 {
    public static void main(String[] args) {
//        arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
        int [] arr={11,13,17,23,29,31,7,5,2,3};
        int k=3;
        int threshold=5;
        System.out.println(count(arr,k,threshold));
    }
    public static int count(int [] arr,int k ,int threshold){
        double avg=0;
        int  ans=0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];

        }
        avg=sum/k;
        if(avg>=threshold){
            ans++;
        }


        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            avg=sum/k;
            if(avg>=threshold){
                ans++;
            }

        }
        return ans;
    }
}
