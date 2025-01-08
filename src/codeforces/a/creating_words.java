package codeforces.a;

import java.util.Scanner;

public class creating_words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            String a=sc.next();
            String b=sc.next();
            sc.nextLine();
            StringBuilder sb=new StringBuilder();
            sb.append(b.charAt(0));
            sb.append(a.substring(1));
            sb.append(" ");
            sb.append(a.charAt(0));
            sb.append(b.substring(1));
            System.out.println(sb);
        }
    }
}
