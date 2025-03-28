package winter_arc;
import java.util.*;
public class leetcode_187 {
    public static void main(String[] args) {
        String s="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences(s));
    }
    public static List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> h= new HashSet<>();
        HashSet<String> res= new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            String sub= s.substring(i,i+10);
            if(!h.contains(sub)){
                h.add(sub);
            }
            else{
                res.add(sub);
            }
        }
        List<String> ans= new ArrayList<>(res);
        return ans;

    }
}
