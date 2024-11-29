package lec1;

public class string_toogle {
    public static void main(String[] args) {
        String s="abC";
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                ans += (char)(s.charAt(i)+32);
            }
            else{
                ans+=(char)(s.charAt(i)-32);
            }
        }
        System.out.println(ans);
    }
}
