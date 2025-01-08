package codeforces.a;
import java.util.*;
public class word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int uc=0;
        int lc=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                uc++;
            }
            else{
                lc++;
            }

        }
        if(uc>lc){
            System.out.println(s.toUpperCase());
        }
        else{
            System.out.println(s.toLowerCase());
        }
    }
}
