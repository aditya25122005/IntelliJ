package recursion;

public class keypad {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv","wxyz"};
    public static void main(String[] args) {
        String ques="23";
        print(ques,"");
    }
    public static void print(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        String getString=key[ch-'0'];
        for(int i=0;i<getString.length();i++){
            print(ques.substring(1),ans+getString.charAt(i));
        }
    }
}
