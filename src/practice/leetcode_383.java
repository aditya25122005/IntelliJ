package practice;

public class leetcode_383 {
    public static void main(String[] args) {
        String ransomNote="aa";
        String magazine="ab";
        System.out.println(canConstruct(ransomNote,magazine));


    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        int[] counter=new int[26];
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            counter[ch-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(counter[ch-'a']==0) return false;
            counter[ch-'a']--;

        }
        return true;
    }
}
