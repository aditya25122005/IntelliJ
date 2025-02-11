package winter_arc;

public class leetcode_1910 {
    public static void main(String[] args) {
        String s="daabcbaabcbc";
        String part="abc";
        System.out.println(removeOccurrences(s,part));
    }
    public static String removeOccurrences(String s, String part) {
        int n=part.length();
        while(s.contains(part)){
            int idx=s.indexOf(part);
            s=s.substring(0,idx)+s.substring(idx+n);
        }
        return s;

    }
}
