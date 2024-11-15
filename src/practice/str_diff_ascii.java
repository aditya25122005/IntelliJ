package practice;

import java.util.*;
public class str_diff_ascii {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            sb.append(s.charAt(i));
            sb.append(s.charAt(i+1)-s.charAt(i));
        }
        sb.append(s.charAt(s.length()-1));
        System.out.println(sb.toString());
    }
}
