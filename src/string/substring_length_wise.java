package string;

public class substring_length_wise {
    public static void main(String[] args) {
        String str="CodingBlocks";

    }
    public static void printSubstring(String s){
        for(int len=1;len<=s.length();len++){
            for(int j=len;j<=s.length();j++){
                int i= j-len;
                System.out.println(s.substring(i,j));
            }
        }
    }
}
