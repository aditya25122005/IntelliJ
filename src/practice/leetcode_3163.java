package practice;

public class leetcode_3163 {
    public static void main(String[] args) {
       String word="aaaaaaaaaaaaaabb";
        System.out.println(compressedString(word));
    }
    public static String compressedString(String word) {
        StringBuilder comp=new StringBuilder();
        char ch=word.charAt(0);
        int count=1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==ch && count<9){
                count++;
            }
            else{
                comp.append(count).append(ch);
                ch=word.charAt(i);
                count=1;
            }
        }
        comp.append(count).append(ch);
        return comp.toString();


    }
}
