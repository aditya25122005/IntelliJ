package winter_arc;

public class longest_consec_one {
    public static void main(String[] args) {
        int [] arr={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(longestOnes(arr,k));
    }
    public static int longestOnes(int[] arr, int k) {

        int maxlen=Maxlen(0,arr,k);
        return maxlen;
    }
    public static int Maxlen(int ele,int[] arr,int k){
        int ei=0;
        int si=0;
        int flip=0;
        int ans=0;

        while(ei<arr.length){
            if(arr[ei]==ele){
                flip++;
            }
            while(flip>k){
                if(arr[si]==ele){
                    flip--;
                }
                si++;
            }

            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;



    }
}
