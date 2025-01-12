package winter_arc;
import java.util.*;
public class leetcode_2309 {
    public static void main(String[] args) {
        String s="Aditya";
        System.out.println(greatestLetter(s));
    }
    public static String greatestLetter(String s) {
        char[] arr=s.toCharArray();
        HashSet<Character> h1=new HashSet<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            h1.add(s.charAt(i));
        }

        for(char ch='Z';ch>='A';ch--){
            if(h1.contains(ch) && h1.contains(Character.toLowerCase(ch))){
                return String.valueOf(ch);
            }
        }

        return "";
    }
}
