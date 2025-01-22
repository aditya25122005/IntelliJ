package winter_arc;
import java.util.*;
public class leetcode_2716 {
    public static void main(String[] args) {
        System.out.println(minimizedStringLength("aaabc"));
    }
    public static int minimizedStringLength(String s) {
        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<s.length();i++){
            h.add(s.charAt(i));
        }
        return h.size();
    }
}
