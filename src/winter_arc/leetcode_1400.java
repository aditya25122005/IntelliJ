package winter_arc;

public class leetcode_1400 {
    public static void main(String[] args) {
        String s="Annabelle";
        int k=2;
        System.out.println(canConstruct(s,k));
    }
    public static boolean canConstruct(String s, int k) {
        if(s.length()<k){
            return false;
        }
        if(s.length()==k){
            return true;
        }
        int [] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int odd =0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]%2==1){
                odd++;
            }
        }
        if(odd>k){
            return false;
        }

        return true;



    }
}
