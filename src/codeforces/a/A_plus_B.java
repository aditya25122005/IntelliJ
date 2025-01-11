package codeforces.a;
import java.util.*;

public class A_plus_B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int T=1;T<=t;T++){
            int ans=0;
            String s=sc.next();
            sc.nextLine();
            ans+=s.charAt(0)-'0'+s.charAt(2)-'0';
            System.out.println(ans);

        }



    }
}
