package winter_arc;

public class lengthWiseSubstring {
    public static void main(String[] args) {
        String s="Aditya";
        for(int len=1;len<=s.length();len++){
            for(int j=len;j<=s.length();j++){
                int i=j-len;
                System.out.println(s.substring(i,j));
            }
        }
    }
}
