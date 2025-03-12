package winter_arc;

public class leetcode_2938 {
    public static void main(String[] args) {
        System.out.println(minimumSteps("10001001010101"));
    }
    public static long minimumSteps(String s) {
        long count0=0;
        long ans=0;

        char[] arr=s.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]=='0'){
                count0++;
            }
            else {
                ans+=count0;;
            }
        }
        return ans;
    }
}
