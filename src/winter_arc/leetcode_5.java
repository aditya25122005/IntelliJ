package winter_arc;

public class leetcode_5 {
    public static void main(String[] args) {
        String s="badab";
        System.out.println(substring(s));
    }
    public static String substring(String s){
        for(int len=s.length();len>=1;len--){
            for(int j=len;j<=s.length();j++){//len=i-j
                int i=j-len;
                if(isPalindrome(s.substring(i,j))){
                    return s.substring(i,j);
                }
            }
        }
        return "";

    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!= s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
