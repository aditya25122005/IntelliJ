package winter_arc;

public class leetcode_1456 {
    public static void main(String[] args) {
//        Input: s = "abciiidef", k = 3
        String s="leetcode";
        int k=3;
        System.out.println(solution(s,k));
    }
    public static  int solution(String s,int k){
        int vowel=0;
        int ans=0;

        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                vowel++;
            }
        }
        ans=vowel;

        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                vowel++;
            }
            if(isVowel(s.charAt(i-k))){
                vowel--;
            }
            ans=Math.max(ans,vowel);
        }
        return ans;
    }
    public static boolean isVowel(char ch){
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;

        }
        return false;
    }
}
