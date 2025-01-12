package recursion_practice;

public class subsequence {
    public static void main(String[] args) {
        String s="abcd";
        Subsequence(s,"");
       // System.out.println(count);
        System.out.println(CountSubsequence(s,""));
    }
    //static int count=0;
    public static int CountSubsequence(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            // count++;
            return 1;
        }

        char ch=s.charAt(0);
        int a=CountSubsequence(s.substring(1),ans);
        int b=CountSubsequence(s.substring(1),ans+ch);
        return a+b;
    }
    public static void Subsequence(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
           // count++;
            return;
        }

        char ch=s.charAt(0);
        Subsequence(s.substring(1),ans);
        Subsequence(s.substring(1),ans+ch);
    }
}
