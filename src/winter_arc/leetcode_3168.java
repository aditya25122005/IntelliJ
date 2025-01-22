package winter_arc;

public class leetcode_3168 {
    public static void main(String[] args) {
        String s="ELELEEL";
        System.out.println(minimumChairs(s));
    }
    public  static int minimumChairs(String s) {
        int ans=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                count++;
                ans=Math.max(ans,count);
            }
            else {
                count--;
            }
        }
        return ans;
    }
}
