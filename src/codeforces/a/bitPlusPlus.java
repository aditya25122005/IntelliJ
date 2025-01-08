package codeforces.a;

import java.util.Scanner;

public class bitPlusPlus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        for(int i=1;i<=n;i++){
            String s=sc.next();
            sc.nextLine();
            if(s.charAt(0)=='-' || s.charAt(s.length()-1)=='-'){
                x--;
            }
            else{
                x++;
            }
        }
        System.out.println(x);

    }
}
