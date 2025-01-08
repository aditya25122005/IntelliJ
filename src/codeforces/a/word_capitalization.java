package codeforces.a;
import java.util.*;
public class word_capitalization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        StringBuilder sb=new StringBuilder();
        if(s.charAt(0)>='a' && s.charAt(0)<='z'){
            sb.append((char)(s.charAt(0)-32));
        }
        else{
            sb.append(s.charAt(0));
        }
        for(int i=1;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        System.out.println(sb);

    }
}
