package winter_arc;

public class leetcode_3090 {
    public static void main(String[] args) {
        String s="bcbbbcba";
        System.out.println(maximumLengthSubstring(s));
    }
    public static int maximumLengthSubstring(String s) {
        int si=0;
        int ei=0;
        int [] arr=new int[26];
        int ans=0;
        while(ei<s.length())
        {
            arr[s.charAt(ei)-'a']++;
            if(arr[s.charAt(ei)-'a']>2){
                while(arr[s.charAt(ei)-'a']>2){
                    arr[s.charAt(si)-'a']--;
                    si++;
                }
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;

    }
}
