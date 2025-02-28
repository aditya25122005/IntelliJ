package winter_arc;

public class leetcode_1684 {
    public static void main(String[] args) {
        String allowed="ab";
        String [] words={"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed,words));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String word:words){
            if(isAllowed(word,allowed)){
                count++;
            }
        }
        return count;
    }
    public static boolean isAllowed(String word,String allowed){
        for(char ch:word.toCharArray()){
            if(allowed.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
}
