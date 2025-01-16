package winter_arc;

public class leetcode_2390 {
    public static void main(String[] args) {
        String s="leet**cod*e";
        System.out.println(removeStars(s));

    }
    public static String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        int idx=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                idx--;
                sb.deleteCharAt(idx);

            }
            else{
                sb.append(s.charAt(i));
                idx++;
            }
        }

        return sb.toString();
    }
}
