package winter_arc;

public class leetcode_3228 {
    public static void main(String[] args) {
        String s="1001101";
        System.out.println(maxOperations(s));
    }
    public static int maxOperations(String s) {
        int ans=0;
        int ones=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
            if(i>0 && s.charAt(i)<s.charAt(i-1)){
                ans+=ones;
            }
        }
        return ans;

    }
}
