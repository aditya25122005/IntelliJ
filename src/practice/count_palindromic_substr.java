package practice;

import java.util.*;
public class count_palindromic_substr {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int count=0;
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(isPalindrome(s.substring(i,j))){
                    count++;

                }

            }
        }
        System.out.println(count);
    }
    public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
