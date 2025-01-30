package backtracking;
import java.util.*;
public class leetcode_Palindrome_partitioning {
    public static void main(String[] args) {
        String s="aab";
        List<List<String>> ans=new ArrayList<>();
        List<String> l1=new ArrayList<>();

        partitioning(s,l1,ans);

    }
    public List<List<String>> partition(String s) {
        //nitin
        List<List<String>> ans=new ArrayList<>();
        List<String> l1=new ArrayList<>();

        partitioning(s,l1,ans);
        return ans;

    }
    public static void partitioning(String ques,List<String> l1,List<List<String>> ans){
        if(ques.length()==0){
            ans.add(new ArrayList<String>(l1));
            // System.out.println(ans);
            return;
        }
        for(int cut=1;cut<=ques.length();cut++){
            String s=ques.substring(0,cut);
            if(isPalindrome(s)) {
                l1.add(s);
                partitioning(ques.substring(cut), l1 ,ans);
                l1.remove(l1.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
