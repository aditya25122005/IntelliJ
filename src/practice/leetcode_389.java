package practice;

public class leetcode_389 {
    public static void main(String[] args) {
      String  s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s,t));

    }
    public static char findTheDifference(String s, String t) {
        int s_sum=0;
        int t_sum=0;
        for(char c:s.toCharArray()){
            s_sum+=(int)c;

        }
        for(char c:t.toCharArray()){
            t_sum+=(int)c;
        }
        return (char)(t_sum-s_sum);
    }
}
