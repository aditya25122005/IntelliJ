package winter_arc;

public class leetcode_1394 {
    public static void main(String[] args) {
        int [] arr={2,2,3,4};
        System.out.println(findLucky(arr));
    }
    public static int findLucky(int[] arr) {
        int[] freq=new int[501];
        for(int ele:arr){
            freq[ele]++;
        }
        int ans=-1;
        for(int i=1;i<501;i++){
            if(i==freq[i]){
                ans=Math.max(ans,freq[i]);
            }
        }
        return ans;
    }
}
