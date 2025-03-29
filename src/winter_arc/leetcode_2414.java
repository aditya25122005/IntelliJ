package winter_arc;

public class leetcode_2414 {
    public static void main(String[] args) {
        String s="abacaba";
        System.out.println(longestContinuousSubstring(s));
    }
    public static int longestContinuousSubstring(String s) {
        if(s.length()==1) return 1;
        int si=0;
        int ei=0;
        int maxlen=0;
        int curr=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i+1)-s.charAt(i)==1){
                ei++;
                maxlen=Math.max(maxlen,ei-si+1);
            }
            else{
                maxlen=Math.max(maxlen,1);
                si=ei+1;
                ei=si;
            }
        }
        return maxlen;
    }
}
