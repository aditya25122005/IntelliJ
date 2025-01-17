package winter_arc;

public class leetcode_171 {
    public static void main(String[] args) {
        System.out.println(titleToNumber("ABC"));
    }
    public static int titleToNumber(String s) {
        int ans=0;
        char[] arr=s.toCharArray(); // [A,B,C]
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            int  val =s.charAt(i)-'A'+1;
            ans +=((Math.pow(26,n-1-i)) *val);
        }
        return ans;

    }
}
