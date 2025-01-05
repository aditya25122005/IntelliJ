package winter_arc;

public class leetcode_2000 {
    public static void main(String[] args) {
        String word="abcdefd";
        char ch='d';
        System.out.println(reversePrefix(word,ch));
    }
    public static String reversePrefix(String word, char ch) {
        char[] arr=new char[2];
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                String s1=reverse(0,i,word);
                String s2=word.substring(i+1);
                String result=s1+s2;
                return result;
            }
        }
        return word;
    }
    public static String reverse(int a,int b,String word){
        StringBuilder sb=new StringBuilder();
        for(int i=b;i>=0;i--){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}
