package practice;

public class leetcode_1552 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,7};
        int b=3;
        System.out.println(maxDistance(arr,b));

    }

        public static int maxDistance(int[] arr, int b) {
            int n=arr.length;
            return max_min(arr,b);


        }
        static int max_min(int[] arr,int b){
            int lo=0;
            int hi=arr[arr.length-1]-arr[0];
            int ans=0;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                if(isitpossible(mid,arr,b)){
                    ans=mid;
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }

            }
            return ans;
        }

        static boolean isitpossible(int mid,int[] arr,int b){
            int pos=arr[0];
            int ball=1;
            for(int i=1;i<arr.length;i++){
                if(arr[i]-pos>=mid){
                    ball++;
                    pos=arr[i];
                }
                if(ball==b){
                    return true;
                }
            }
            return false;
        }

}
