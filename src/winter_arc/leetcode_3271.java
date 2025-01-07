package winter_arc;

public class leetcode_3271 {
    public static void main(String[] args) {
        String s="abcd";
        int k=2;
        int n=s.length();
        int len=n/k;

        // len=n/k;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i+=k){
            String sub=s.substring(i,i+k);
            int sum=0;
            for(int j=0;j<sub.length();j++){
                sum+= sub.charAt(j)-'a';
            }
            int mod=sum%26;
            int ascii=mod+97;
            char ch=(char)ascii;
            sb.append(ch);

        }
        System.out.println(sb);
    }

}
