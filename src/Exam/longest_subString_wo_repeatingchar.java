package Exam;
import java.util.*;
public class longest_subString_wo_repeatingchar {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int maxlength=0;
        int left=0;
        HashSet<Character>h=new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(h.contains(s.charAt(right))){
                h.remove(s.charAt(left));
                left++;
            }
            h.add(s.charAt(right));
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;

    }
}
