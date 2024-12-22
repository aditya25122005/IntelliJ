package winter_arc;

public class lc_392_subseq {
    public static void main(String[] args) {
        String s="abc";
        String t="ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        int sp=0;
        int tp=0;

        while(sp<s.length() && tp<t.length()){
            if(s.charAt(sp)==t.charAt(tp)){
                sp++;
            }
            tp++;
        }
        return sp==s.length();

    }
}
