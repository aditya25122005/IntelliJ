package codeforces;
import java.util.*;
public class mar_22_A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int count=0;
            StringBuilder sb=new StringBuilder(s);
            String rev= sb.reverse().toString();
            if(n==1){
                System.out.println("NO");
                continue;
            }
            boolean same=true;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=s.charAt(0)){
                    same=false;
                }
            }
            if(same){
                System.out.println("NO");
                continue;
            }
            if(isUniversal(s)){
                System.out.println("YES");
                continue;
            }
            System.out.println(k>=1? "YES" : "NO");


        }
    }
    public static boolean isUniversal(String s){
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return s.charAt(i)<s.charAt(n-i-1);
            }
        }
        return false;
    }
}
