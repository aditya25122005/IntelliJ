package codeforces.a;
import java.util.*;
public class too_long_words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            StringBuilder sb=new StringBuilder();
            String s=sc.next();
            sc.nextLine();
            if(s.length()<=10){
                System.out.println(s);
            }
            else{

                sb.append(s.charAt(0));
                sb.append(s.length()-2);
                sb.append(s.charAt(s.length()-1));
            }
            System.out.println(sb);
        }
    }
}
