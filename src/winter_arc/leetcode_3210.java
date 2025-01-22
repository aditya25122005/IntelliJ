package winter_arc;

public class leetcode_3210 {
    public static void main(String[] args) {
        String s="dart";
        int k=3;
        System.out.println(getEncryptedString(s,k));
    }
    public static String getEncryptedString(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt((i+k)%s.length()));
        }
        return sb.toString();
    }
}
