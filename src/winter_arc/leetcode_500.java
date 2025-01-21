package winter_arc;
import java.util.*;
public class leetcode_500 {
    public static void main(String[] args) {
        String [] words={"Hello","Alaska","Dad","Peace"};
        findWords(words);
    }
    public static String[] findWords(String[] words) {
        String first="qwertyuiop";
        String second="asdfghjkl";
        String three="zxcvbnm";
        List<String> res=new ArrayList<>();
        for(String s: words){
            if(canbetyped(s,first) || canbetyped(s,second) || canbetyped(s,three)){
                res.add(s);
            }
        }
        return res.toArray(new String [0]);
    }
    public static boolean canbetyped(String word,String row){
        for(char ch:word.toCharArray()){
            if(row.indexOf(Character.toLowerCase(ch))==-1){
                return false;
            }
        }
        return true;
    }
}

