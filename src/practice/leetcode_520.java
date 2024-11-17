package practice;

public class leetcode_520 {
    public static void main(String[] args) {
        String word="Usa";
        System.out.println(detectCapitalUse(word));

    }
    public static boolean detectCapitalUse(String word) {
        int n=word.length();
        if(n==1) return true;
        if(word.equals(word.toUpperCase())) return true;
        if(word.equals(word.toLowerCase())) return true;
        String firstCapital=word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        if(word.equals(firstCapital)) return true;
        return false;

    }
}
