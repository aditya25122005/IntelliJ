package practice;

public class frequency_arr {
    public static void main(String[] args) {
        String s="yyyaaabklmcbctmkcchalazabsdkzzzbbb";
        int [] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            freq[idx]++;
        }
    }
}
