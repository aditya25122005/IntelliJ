package codeforces;

import java.util.Scanner;

public class A_lucky_conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        sc.close();
        int c1=0;
        int c2=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='4' && b.charAt(i)=='7'){
                c1++;
            }
            else if(a.charAt(i)=='7' && b.charAt(i)=='4'){
                c2++;
            }
        }
        System.out.println(Math.max(c1,c2));
    }
}
