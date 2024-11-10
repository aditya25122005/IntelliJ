package practice;

import java.util.Arrays;

public class leetcode_557 {
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        String [] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            String str=arr[i];// str="take" --> ekat
            arr[i]=reverse(str);
        }
        String ans = String.join(" ", arr);
        System.out.println(ans);
    }
    public static String reverse(String str){
       StringBuilder reversed=new StringBuilder();
       for(int i=str.length()-1;i>=0;i--){
           reversed.append(str.charAt(i));
       }
       return reversed.toString();
    }
}
