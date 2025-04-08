package codeforces;
import java.util.*;
public class apr_8_B {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        for(int T=1;T<=t;T++){
            helper();
        }
    }
    public static void helper(){
        String s= sc.next();
        int b=0;
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='0'){
                count++;
            }
            else{
                b=Math.max(b,count+1);
            }
        }
        System.out.println(s.length()-b);

    }
}
