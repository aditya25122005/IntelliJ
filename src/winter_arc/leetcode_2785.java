package winter_arc;
import java.util.*;
public class leetcode_2785 {
    public static void main(String[] args) {
        String s="lEetcOde";
        System.out.println(sortVowels(s));
    }
    public static String sortVowels(String s) {
        ArrayList<Character> ll=new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(isVowel(ch)){
                ll.add(ch);
            }
        }
        Collections.sort(ll);
        StringBuilder sb=new StringBuilder();
        int idx=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                sb.append(ll.get(idx++));
            }
            else{
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A'
                || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
}
